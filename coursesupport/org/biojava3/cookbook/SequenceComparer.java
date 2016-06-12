package org.biojava3.cookbook;
 
import java.util.ArrayList;
import org.biojava3.core.sequence.DNASequence;
import org.biojava3.core.sequence.compound.AmbiguityDNACompoundSet;
 
public class SequenceComparer {
 
    private DNASequence seq1;
    private DNASequence seq2;
    private ArrayList<Integer> mismatchIndices = new ArrayList<Integer>();
    private boolean matchingDone = false;
 
    enum lut {
         AA('A'), AC('M'), AG('R'), AT('W'), AR('R'), AY('H'), AK('D'), AM('M'), AS('V'), AW('W'), AB('N'), AD('D'), AH('H'), AV('V'), AN('N'),
         CA('M'), CC('C'), CG('S'), CT('Y'), CR('V'), CY('Y'), CK('B'), CM('M'), CS('S'), CW('H'), CB('B'), CD('N'), CH('H'), CV('V'), CN('N'),
         GA('R'), GC('S'), GG('G'), GT('K'), GR('R'), GY('B'), GK('K'), GM('V'), GS('S'), GW('D'), GB('B'), GD('D'), GH('N'), GV('V'), GN('N'),
         TA('W'), TC('Y'), TG('K'), TT('T'), TR('D'), TY('Y'), TK('K'), TM('H'), TS('B'), TW('W'), TB('B'), TD('D'), TH('H'), TV('N'), TN('N'),
         RA('R'), RC('V'), RG('R'), RT('D'), RR('R'), RY('N'), RK('D'), RM('V'), RS('V'), RW('D'), RB('N'), RD('D'), RH('N'), RV('V'), RN('N'),
         YA('H'), YC('Y'), YG('B'), YT('Y'), YR('N'), YY('Y'), YK('B'), YM('H'), YS('B'), YW('H'), YB('B'), YD('N'), YH('H'), YV('N'), YN('N'),
         KA('D'), KC('B'), KG('K'), KT('K'), KR('D'), KY('B'), KK('K'), KM('N'), KS('B'), KW('D'), KB('B'), KD('D'), KH('N'), KV('N'), KN('N'),
         MA('M'), MC('M'), MG('V'), MT('H'), MR('V'), MY('H'), MK('N'), MM('M'), MS('V'), MW('H'), MB('N'), MD('N'), MH('H'), MV('V'), MN('N'),
         SA('V'), SC('S'), SG('S'), ST('B'), SR('V'), SY('B'), SK('B'), SM('V'), SS('S'), SW('N'), SB('B'), SD('N'), SH('N'), SV('V'), SN('N'),
         WA('W'), WC('H'), WG('D'), WT('W'), WR('D'), WY('H'), WK('D'), WM('H'), WS('N'), WW('W'), WB('N'), WD('D'), WH('H'), WV('N'), WN('N'), 
         BA('N'), BC('B'), BG('B'), BT('B'), BR('N'), BY('B'), BK('B'), BM('N'), BS('B'), BW('N'), BB('B'), BD('N'), BH('N'), BV('N'), BN('N'),
         DA('D'), DC('N'), DG('D'), DT('D'), DR('D'), DY('N'), DK('D'), DM('N'), DS('N'), DW('D'), DB('N'), DD('D'), DH('N'), DV('N'), DN('N'),
         HA('H'), HC('H'), HG('N'), HT('H'), HR('N'), HY('H'), HK('N'), HM('H'), HS('N'), HW('H'), HB('N'), HD('N'), HH('H'), HV('N'), HN('N'),
         VA('V'), VC('V'), VG('V'), VT('N'), VR('V'), VY('N'), VK('N'), VM('V'), VS('V'), VW('N'), VB('N'), VD('N'), VH('N'), VV('V'), VN('N'),
         NA('N'), NC('N'), NG('N'), NT('N'), NR('N'), NY('N'), NK('N'), NM('N'), NS('N'), NW('N'), NB('N'), ND('N'), NH('N'), NV('N'), NN('N');
 
         char consensusChar = 'X';
 
         lut(char c) {
             consensusChar = c;
         }
 
         char getConsensusChar() {
             return consensusChar;
         }
    }
 
 
    public SequenceComparer(DNASequence seq1, DNASequence seq2) {
        if (seq1.getLength() >= seq2.getLength()) {
            this.seq1 = seq1;
            this.seq2 = seq2;
        } else {
            this.seq1 = seq2;
            this.seq2 = seq1;
        }
 
    }
 
    public int getDifferenceCount() {
        for (int i = 0; i < seq1.getLength(); i++) {
            if (i > seq2.getLength()-1) {
                mismatchIndices.add(i);
            } else {
                if (!seq1.getCompoundAt(i+1).equals(seq2.getCompoundAt(i+1))) {
                    mismatchIndices.add(i);
                }
            }
        }
        matchingDone = true;
        return mismatchIndices.size();
    }
 
    public DNASequence getConsensusSequence() {
        if (!matchingDone) {
            getDifferenceCount();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seq1.getLength(); i++) {
            if (mismatchIndices.contains(i)) {
                try {
                    sb.append(getConsensus(seq1.getCompoundAt(i+1).getBase().charAt(0), seq2.getCompoundAt(i+1).getBase().charAt(0)));
                } catch (IndexOutOfBoundsException ex) {
                    sb.append('N');
                }
            } else {
                sb.append(seq1.getCompoundAt(i+1).getBase().charAt(0));
            }
        }
 
        DNASequence result = new DNASequence(sb.toString(), AmbiguityDNACompoundSet.getDNACompoundSet());
        result.setOriginalHeader(seq1.getOriginalHeader() + "|" + seq2.getOriginalHeader());
        return result;
    }
 
    private char getConsensus(char a, char b) {
        return lut.valueOf("" + a + b).getConsensusChar();
    }
 
    public static void main(String[] args) {
        SequenceComparer sc = new SequenceComparer(new DNASequence("ACGT"), new DNASequence("ACC", AmbiguityDNACompoundSet.getDNACompoundSet()));
        System.out.println(sc.getDifferenceCount());
        System.out.println(sc.getConsensusSequence());
        sc = new SequenceComparer(new DNASequence("ACGT"), new DNASequence("ACCN", AmbiguityDNACompoundSet.getDNACompoundSet()));
        System.out.println(sc.getDifferenceCount());
        System.out.println(sc.getConsensusSequence());
    }
 
}
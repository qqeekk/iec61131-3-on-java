/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.parser;

import javast.sablecc.node.*;
import javast.sablecc.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTBit(@SuppressWarnings("unused") TBit node)
    {
        this.index = 0;
    }

    @Override
    public void caseTSign(@SuppressWarnings("unused") TSign node)
    {
        this.index = 1;
    }

    @Override
    public void caseTDollar(@SuppressWarnings("unused") TDollar node)
    {
        this.index = 2;
    }

    @Override
    public void caseTHash(@SuppressWarnings("unused") THash node)
    {
        this.index = 3;
    }

    @Override
    public void caseTDot(@SuppressWarnings("unused") TDot node)
    {
        this.index = 4;
    }

    @Override
    public void caseTDash(@SuppressWarnings("unused") TDash node)
    {
        this.index = 5;
    }

    @Override
    public void caseTUnderscore(@SuppressWarnings("unused") TUnderscore node)
    {
        this.index = 6;
    }

    @Override
    public void caseTColon(@SuppressWarnings("unused") TColon node)
    {
        this.index = 7;
    }

    @Override
    public void caseTSemicolon(@SuppressWarnings("unused") TSemicolon node)
    {
        this.index = 8;
    }

    @Override
    public void caseTColonEq(@SuppressWarnings("unused") TColonEq node)
    {
        this.index = 9;
    }

    @Override
    public void caseTDotDot(@SuppressWarnings("unused") TDotDot node)
    {
        this.index = 10;
    }

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 11;
    }

    @Override
    public void caseTLparen(@SuppressWarnings("unused") TLparen node)
    {
        this.index = 12;
    }

    @Override
    public void caseTRparen(@SuppressWarnings("unused") TRparen node)
    {
        this.index = 13;
    }

    @Override
    public void caseTLbrack(@SuppressWarnings("unused") TLbrack node)
    {
        this.index = 14;
    }

    @Override
    public void caseTRbrack(@SuppressWarnings("unused") TRbrack node)
    {
        this.index = 15;
    }

    @Override
    public void caseTPercent(@SuppressWarnings("unused") TPercent node)
    {
        this.index = 16;
    }

    @Override
    public void caseTOrToken(@SuppressWarnings("unused") TOrToken node)
    {
        this.index = 17;
    }

    @Override
    public void caseTXorToken(@SuppressWarnings("unused") TXorToken node)
    {
        this.index = 18;
    }

    @Override
    public void caseTAndTokenFull(@SuppressWarnings("unused") TAndTokenFull node)
    {
        this.index = 19;
    }

    @Override
    public void caseTEqTokenFull(@SuppressWarnings("unused") TEqTokenFull node)
    {
        this.index = 20;
    }

    @Override
    public void caseTComparisonOperator(@SuppressWarnings("unused") TComparisonOperator node)
    {
        this.index = 21;
    }

    @Override
    public void caseTMulOperator(@SuppressWarnings("unused") TMulOperator node)
    {
        this.index = 22;
    }

    @Override
    public void caseTUnaryOperator(@SuppressWarnings("unused") TUnaryOperator node)
    {
        this.index = 23;
    }

    @Override
    public void caseTNotToken(@SuppressWarnings("unused") TNotToken node)
    {
        this.index = 24;
    }

    @Override
    public void caseTPowerToken(@SuppressWarnings("unused") TPowerToken node)
    {
        this.index = 25;
    }

    @Override
    public void caseTReturnToken(@SuppressWarnings("unused") TReturnToken node)
    {
        this.index = 26;
    }

    @Override
    public void caseTArrowToken(@SuppressWarnings("unused") TArrowToken node)
    {
        this.index = 27;
    }

    @Override
    public void caseTIdentifier(@SuppressWarnings("unused") TIdentifier node)
    {
        this.index = 28;
    }

    @Override
    public void caseTSingleByteCharacterString(@SuppressWarnings("unused") TSingleByteCharacterString node)
    {
        this.index = 29;
    }

    @Override
    public void caseTDoubleByteCharacterString(@SuppressWarnings("unused") TDoubleByteCharacterString node)
    {
        this.index = 30;
    }

    @Override
    public void caseTExponentSign(@SuppressWarnings("unused") TExponentSign node)
    {
        this.index = 31;
    }

    @Override
    public void caseTExponent(@SuppressWarnings("unused") TExponent node)
    {
        this.index = 32;
    }

    @Override
    public void caseTSignedInteger(@SuppressWarnings("unused") TSignedInteger node)
    {
        this.index = 33;
    }

    @Override
    public void caseTInteger(@SuppressWarnings("unused") TInteger node)
    {
        this.index = 34;
    }

    @Override
    public void caseTSignedIntegerLiteral(@SuppressWarnings("unused") TSignedIntegerLiteral node)
    {
        this.index = 35;
    }

    @Override
    public void caseTUnsignedIntegerLiteral(@SuppressWarnings("unused") TUnsignedIntegerLiteral node)
    {
        this.index = 36;
    }

    @Override
    public void caseTString1TypeName(@SuppressWarnings("unused") TString1TypeName node)
    {
        this.index = 37;
    }

    @Override
    public void caseTWstringTypeName(@SuppressWarnings("unused") TWstringTypeName node)
    {
        this.index = 38;
    }

    @Override
    public void caseTTimeTypeName(@SuppressWarnings("unused") TTimeTypeName node)
    {
        this.index = 39;
    }

    @Override
    public void caseTTimeTypeNameFull(@SuppressWarnings("unused") TTimeTypeNameFull node)
    {
        this.index = 40;
    }

    @Override
    public void caseTSignedIntegerTypeName(@SuppressWarnings("unused") TSignedIntegerTypeName node)
    {
        this.index = 41;
    }

    @Override
    public void caseTUnsignedIntegerTypeName(@SuppressWarnings("unused") TUnsignedIntegerTypeName node)
    {
        this.index = 42;
    }

    @Override
    public void caseTRealTypeName(@SuppressWarnings("unused") TRealTypeName node)
    {
        this.index = 43;
    }

    @Override
    public void caseTDateTypeName(@SuppressWarnings("unused") TDateTypeName node)
    {
        this.index = 44;
    }

    @Override
    public void caseTBitStringTypeName(@SuppressWarnings("unused") TBitStringTypeName node)
    {
        this.index = 45;
    }

    @Override
    public void caseTBitStringLiteralTypeName(@SuppressWarnings("unused") TBitStringLiteralTypeName node)
    {
        this.index = 46;
    }

    @Override
    public void caseTBoolTypeName(@SuppressWarnings("unused") TBoolTypeName node)
    {
        this.index = 47;
    }

    @Override
    public void caseTTimeOfDayTypeNameFull(@SuppressWarnings("unused") TTimeOfDayTypeNameFull node)
    {
        this.index = 48;
    }

    @Override
    public void caseTDateTypeNameFull(@SuppressWarnings("unused") TDateTypeNameFull node)
    {
        this.index = 49;
    }

    @Override
    public void caseTDateAndTimeTypeNameFull(@SuppressWarnings("unused") TDateAndTimeTypeNameFull node)
    {
        this.index = 50;
    }

    @Override
    public void caseTTrueFalseLiteral(@SuppressWarnings("unused") TTrueFalseLiteral node)
    {
        this.index = 51;
    }

    @Override
    public void caseTDayIdentifier(@SuppressWarnings("unused") TDayIdentifier node)
    {
        this.index = 52;
    }

    @Override
    public void caseTHourIdentifier(@SuppressWarnings("unused") THourIdentifier node)
    {
        this.index = 53;
    }

    @Override
    public void caseTMinuteIdentifier(@SuppressWarnings("unused") TMinuteIdentifier node)
    {
        this.index = 54;
    }

    @Override
    public void caseTSecondIdentifier(@SuppressWarnings("unused") TSecondIdentifier node)
    {
        this.index = 55;
    }

    @Override
    public void caseTMillisecondIdentifier(@SuppressWarnings("unused") TMillisecondIdentifier node)
    {
        this.index = 56;
    }

    @Override
    public void caseTTypeToken(@SuppressWarnings("unused") TTypeToken node)
    {
        this.index = 57;
    }

    @Override
    public void caseTEndTypeToken(@SuppressWarnings("unused") TEndTypeToken node)
    {
        this.index = 58;
    }

    @Override
    public void caseTArrayToken(@SuppressWarnings("unused") TArrayToken node)
    {
        this.index = 59;
    }

    @Override
    public void caseTOfToken(@SuppressWarnings("unused") TOfToken node)
    {
        this.index = 60;
    }

    @Override
    public void caseTStructToken(@SuppressWarnings("unused") TStructToken node)
    {
        this.index = 61;
    }

    @Override
    public void caseTEndStructToken(@SuppressWarnings("unused") TEndStructToken node)
    {
        this.index = 62;
    }

    @Override
    public void caseTVarToken(@SuppressWarnings("unused") TVarToken node)
    {
        this.index = 63;
    }

    @Override
    public void caseTEndVarToken(@SuppressWarnings("unused") TEndVarToken node)
    {
        this.index = 64;
    }

    @Override
    public void caseTConstantToken(@SuppressWarnings("unused") TConstantToken node)
    {
        this.index = 65;
    }

    @Override
    public void caseTVarInputToken(@SuppressWarnings("unused") TVarInputToken node)
    {
        this.index = 66;
    }

    @Override
    public void caseTVarOutputToken(@SuppressWarnings("unused") TVarOutputToken node)
    {
        this.index = 67;
    }

    @Override
    public void caseTVarInOutToken(@SuppressWarnings("unused") TVarInOutToken node)
    {
        this.index = 68;
    }

    @Override
    public void caseTVarExternalToken(@SuppressWarnings("unused") TVarExternalToken node)
    {
        this.index = 69;
    }

    @Override
    public void caseTVarTempToken(@SuppressWarnings("unused") TVarTempToken node)
    {
        this.index = 70;
    }

    @Override
    public void caseTVarAccessToken(@SuppressWarnings("unused") TVarAccessToken node)
    {
        this.index = 71;
    }

    @Override
    public void caseTFunctionToken(@SuppressWarnings("unused") TFunctionToken node)
    {
        this.index = 72;
    }

    @Override
    public void caseTEndFunctionToken(@SuppressWarnings("unused") TEndFunctionToken node)
    {
        this.index = 73;
    }

    @Override
    public void caseTFunctionBlockToken(@SuppressWarnings("unused") TFunctionBlockToken node)
    {
        this.index = 74;
    }

    @Override
    public void caseTEndFunctionBlockToken(@SuppressWarnings("unused") TEndFunctionBlockToken node)
    {
        this.index = 75;
    }

    @Override
    public void caseTProgramToken(@SuppressWarnings("unused") TProgramToken node)
    {
        this.index = 76;
    }

    @Override
    public void caseTEndProgramToken(@SuppressWarnings("unused") TEndProgramToken node)
    {
        this.index = 77;
    }

    @Override
    public void caseTAtToken(@SuppressWarnings("unused") TAtToken node)
    {
        this.index = 78;
    }

    @Override
    public void caseTIfToken(@SuppressWarnings("unused") TIfToken node)
    {
        this.index = 79;
    }

    @Override
    public void caseTThenToken(@SuppressWarnings("unused") TThenToken node)
    {
        this.index = 80;
    }

    @Override
    public void caseTEndIfToken(@SuppressWarnings("unused") TEndIfToken node)
    {
        this.index = 81;
    }

    @Override
    public void caseTElseIfToken(@SuppressWarnings("unused") TElseIfToken node)
    {
        this.index = 82;
    }

    @Override
    public void caseTElseToken(@SuppressWarnings("unused") TElseToken node)
    {
        this.index = 83;
    }

    @Override
    public void caseTCaseToken(@SuppressWarnings("unused") TCaseToken node)
    {
        this.index = 84;
    }

    @Override
    public void caseTEndCaseToken(@SuppressWarnings("unused") TEndCaseToken node)
    {
        this.index = 85;
    }

    @Override
    public void caseTForToken(@SuppressWarnings("unused") TForToken node)
    {
        this.index = 86;
    }

    @Override
    public void caseTDoToken(@SuppressWarnings("unused") TDoToken node)
    {
        this.index = 87;
    }

    @Override
    public void caseTEndForToken(@SuppressWarnings("unused") TEndForToken node)
    {
        this.index = 88;
    }

    @Override
    public void caseTToToken(@SuppressWarnings("unused") TToToken node)
    {
        this.index = 89;
    }

    @Override
    public void caseTByToken(@SuppressWarnings("unused") TByToken node)
    {
        this.index = 90;
    }

    @Override
    public void caseTWhileToken(@SuppressWarnings("unused") TWhileToken node)
    {
        this.index = 91;
    }

    @Override
    public void caseTEndWhileToken(@SuppressWarnings("unused") TEndWhileToken node)
    {
        this.index = 92;
    }

    @Override
    public void caseTRepeatToken(@SuppressWarnings("unused") TRepeatToken node)
    {
        this.index = 93;
    }

    @Override
    public void caseTEndRepeatToken(@SuppressWarnings("unused") TEndRepeatToken node)
    {
        this.index = 94;
    }

    @Override
    public void caseTUntilToken(@SuppressWarnings("unused") TUntilToken node)
    {
        this.index = 95;
    }

    @Override
    public void caseTExitToken(@SuppressWarnings("unused") TExitToken node)
    {
        this.index = 96;
    }

    @Override
    public void caseTLocationPrefix(@SuppressWarnings("unused") TLocationPrefix node)
    {
        this.index = 97;
    }

    @Override
    public void caseTSizePrefix(@SuppressWarnings("unused") TSizePrefix node)
    {
        this.index = 98;
    }

    @Override
    public void caseTIncomplLocation(@SuppressWarnings("unused") TIncomplLocation node)
    {
        this.index = 99;
    }

    @Override
    public void caseTEdge(@SuppressWarnings("unused") TEdge node)
    {
        this.index = 100;
    }

    @Override
    public void caseTRetainToken(@SuppressWarnings("unused") TRetainToken node)
    {
        this.index = 101;
    }

    @Override
    public void caseTNonRetainToken(@SuppressWarnings("unused") TNonRetainToken node)
    {
        this.index = 102;
    }

    @Override
    public void caseTRetain(@SuppressWarnings("unused") TRetain node)
    {
        this.index = 103;
    }

    @Override
    public void caseTStandardFunctionBlockName(@SuppressWarnings("unused") TStandardFunctionBlockName node)
    {
        this.index = 104;
    }

    @Override
    public void caseTDirection(@SuppressWarnings("unused") TDirection node)
    {
        this.index = 105;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 106;
    }
}

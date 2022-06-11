/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TVarInOutToken extends Token
{
    public TVarInOutToken()
    {
        super.setText("VAR_IN_OUT");
    }

    public TVarInOutToken(int line, int pos)
    {
        super.setText("VAR_IN_OUT");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TVarInOutToken(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVarInOutToken(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TVarInOutToken text.");
    }
}
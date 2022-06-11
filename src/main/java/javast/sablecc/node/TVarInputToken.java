/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TVarInputToken extends Token
{
    public TVarInputToken()
    {
        super.setText("VAR_INPUT");
    }

    public TVarInputToken(int line, int pos)
    {
        super.setText("VAR_INPUT");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TVarInputToken(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVarInputToken(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TVarInputToken text.");
    }
}
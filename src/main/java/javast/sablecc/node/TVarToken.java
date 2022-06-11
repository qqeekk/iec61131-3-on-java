/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TVarToken extends Token
{
    public TVarToken()
    {
        super.setText("VAR");
    }

    public TVarToken(int line, int pos)
    {
        super.setText("VAR");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TVarToken(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVarToken(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TVarToken text.");
    }
}
/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TOfToken extends Token
{
    public TOfToken()
    {
        super.setText("OF");
    }

    public TOfToken(int line, int pos)
    {
        super.setText("OF");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOfToken(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOfToken(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TOfToken text.");
    }
}
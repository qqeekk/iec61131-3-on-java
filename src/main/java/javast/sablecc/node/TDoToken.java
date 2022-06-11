/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TDoToken extends Token
{
    public TDoToken()
    {
        super.setText("DO");
    }

    public TDoToken(int line, int pos)
    {
        super.setText("DO");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDoToken(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDoToken(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDoToken text.");
    }
}
/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TByToken extends Token
{
    public TByToken()
    {
        super.setText("BY");
    }

    public TByToken(int line, int pos)
    {
        super.setText("BY");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TByToken(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTByToken(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TByToken text.");
    }
}
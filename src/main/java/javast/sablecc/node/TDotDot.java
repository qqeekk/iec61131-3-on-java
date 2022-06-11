/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TDotDot extends Token
{
    public TDotDot()
    {
        super.setText("..");
    }

    public TDotDot(int line, int pos)
    {
        super.setText("..");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDotDot(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDotDot(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDotDot text.");
    }
}

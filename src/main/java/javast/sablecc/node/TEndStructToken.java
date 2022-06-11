/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TEndStructToken extends Token
{
    public TEndStructToken()
    {
        super.setText("END_STRUCT");
    }

    public TEndStructToken(int line, int pos)
    {
        super.setText("END_STRUCT");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEndStructToken(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEndStructToken(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEndStructToken text.");
    }
}
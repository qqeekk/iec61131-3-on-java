/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TEndIfToken extends Token
{
    public TEndIfToken()
    {
        super.setText("END_IF");
    }

    public TEndIfToken(int line, int pos)
    {
        super.setText("END_IF");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEndIfToken(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEndIfToken(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEndIfToken text.");
    }
}
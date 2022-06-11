/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TEndProgramToken extends Token
{
    public TEndProgramToken()
    {
        super.setText("END_PROGRAM");
    }

    public TEndProgramToken(int line, int pos)
    {
        super.setText("END_PROGRAM");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEndProgramToken(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEndProgramToken(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEndProgramToken text.");
    }
}
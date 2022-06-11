/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TEndFunctionToken extends Token
{
    public TEndFunctionToken()
    {
        super.setText("END_FUNCTION");
    }

    public TEndFunctionToken(int line, int pos)
    {
        super.setText("END_FUNCTION");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEndFunctionToken(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEndFunctionToken(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEndFunctionToken text.");
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TFunctionBlockToken extends Token
{
    public TFunctionBlockToken()
    {
        super.setText("FUNCTION_BLOCK");
    }

    public TFunctionBlockToken(int line, int pos)
    {
        super.setText("FUNCTION_BLOCK");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFunctionBlockToken(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFunctionBlockToken(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFunctionBlockToken text.");
    }
}
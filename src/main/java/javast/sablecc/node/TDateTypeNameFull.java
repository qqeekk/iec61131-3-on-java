/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TDateTypeNameFull extends Token
{
    public TDateTypeNameFull(String text)
    {
        setText(text);
    }

    public TDateTypeNameFull(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDateTypeNameFull(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDateTypeNameFull(this);
    }
}
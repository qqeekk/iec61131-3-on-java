/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TDateAndTimeTypeNameFull extends Token
{
    public TDateAndTimeTypeNameFull(String text)
    {
        setText(text);
    }

    public TDateAndTimeTypeNameFull(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDateAndTimeTypeNameFull(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDateAndTimeTypeNameFull(this);
    }
}

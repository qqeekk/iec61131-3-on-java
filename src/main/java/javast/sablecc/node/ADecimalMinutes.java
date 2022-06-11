/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ADecimalMinutes extends PMinutes
{
    private PFixedPoint _fixedPoint_;
    private TMinuteIdentifier _minuteIdentifier_;

    public ADecimalMinutes()
    {
        // Constructor
    }

    public ADecimalMinutes(
        @SuppressWarnings("hiding") PFixedPoint _fixedPoint_,
        @SuppressWarnings("hiding") TMinuteIdentifier _minuteIdentifier_)
    {
        // Constructor
        setFixedPoint(_fixedPoint_);

        setMinuteIdentifier(_minuteIdentifier_);

    }

    @Override
    public Object clone()
    {
        return new ADecimalMinutes(
            cloneNode(this._fixedPoint_),
            cloneNode(this._minuteIdentifier_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecimalMinutes(this);
    }

    public PFixedPoint getFixedPoint()
    {
        return this._fixedPoint_;
    }

    public void setFixedPoint(PFixedPoint node)
    {
        if(this._fixedPoint_ != null)
        {
            this._fixedPoint_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fixedPoint_ = node;
    }

    public TMinuteIdentifier getMinuteIdentifier()
    {
        return this._minuteIdentifier_;
    }

    public void setMinuteIdentifier(TMinuteIdentifier node)
    {
        if(this._minuteIdentifier_ != null)
        {
            this._minuteIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._minuteIdentifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fixedPoint_)
            + toString(this._minuteIdentifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fixedPoint_ == child)
        {
            this._fixedPoint_ = null;
            return;
        }

        if(this._minuteIdentifier_ == child)
        {
            this._minuteIdentifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fixedPoint_ == oldChild)
        {
            setFixedPoint((PFixedPoint) newChild);
            return;
        }

        if(this._minuteIdentifier_ == oldChild)
        {
            setMinuteIdentifier((TMinuteIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ADecimalDays extends PDays
{
    private PFixedPoint _fixedPoint_;
    private TDayIdentifier _dayIdentifier_;

    public ADecimalDays()
    {
        // Constructor
    }

    public ADecimalDays(
        @SuppressWarnings("hiding") PFixedPoint _fixedPoint_,
        @SuppressWarnings("hiding") TDayIdentifier _dayIdentifier_)
    {
        // Constructor
        setFixedPoint(_fixedPoint_);

        setDayIdentifier(_dayIdentifier_);

    }

    @Override
    public Object clone()
    {
        return new ADecimalDays(
            cloneNode(this._fixedPoint_),
            cloneNode(this._dayIdentifier_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecimalDays(this);
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

    public TDayIdentifier getDayIdentifier()
    {
        return this._dayIdentifier_;
    }

    public void setDayIdentifier(TDayIdentifier node)
    {
        if(this._dayIdentifier_ != null)
        {
            this._dayIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dayIdentifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fixedPoint_)
            + toString(this._dayIdentifier_);
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

        if(this._dayIdentifier_ == child)
        {
            this._dayIdentifier_ = null;
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

        if(this._dayIdentifier_ == oldChild)
        {
            setDayIdentifier((TDayIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
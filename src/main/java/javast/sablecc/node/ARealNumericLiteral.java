/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ARealNumericLiteral extends PNumericLiteral
{
    private PRealLiteral _realLiteral_;

    public ARealNumericLiteral()
    {
        // Constructor
    }

    public ARealNumericLiteral(
        @SuppressWarnings("hiding") PRealLiteral _realLiteral_)
    {
        // Constructor
        setRealLiteral(_realLiteral_);

    }

    @Override
    public Object clone()
    {
        return new ARealNumericLiteral(
            cloneNode(this._realLiteral_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARealNumericLiteral(this);
    }

    public PRealLiteral getRealLiteral()
    {
        return this._realLiteral_;
    }

    public void setRealLiteral(PRealLiteral node)
    {
        if(this._realLiteral_ != null)
        {
            this._realLiteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._realLiteral_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._realLiteral_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._realLiteral_ == child)
        {
            this._realLiteral_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._realLiteral_ == oldChild)
        {
            setRealLiteral((PRealLiteral) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

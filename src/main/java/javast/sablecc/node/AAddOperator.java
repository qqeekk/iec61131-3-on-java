/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AAddOperator extends PAddOperator
{
    private TSign _sign_;

    public AAddOperator()
    {
        // Constructor
    }

    public AAddOperator(
        @SuppressWarnings("hiding") TSign _sign_)
    {
        // Constructor
        setSign(_sign_);

    }

    @Override
    public Object clone()
    {
        return new AAddOperator(
            cloneNode(this._sign_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAddOperator(this);
    }

    public TSign getSign()
    {
        return this._sign_;
    }

    public void setSign(TSign node)
    {
        if(this._sign_ != null)
        {
            this._sign_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sign_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._sign_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._sign_ == child)
        {
            this._sign_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._sign_ == oldChild)
        {
            setSign((TSign) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

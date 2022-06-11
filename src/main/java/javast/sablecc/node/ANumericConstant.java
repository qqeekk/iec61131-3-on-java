/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ANumericConstant extends PConstant
{
    private PNumericLiteral _numericLiteral_;

    public ANumericConstant()
    {
        // Constructor
    }

    public ANumericConstant(
        @SuppressWarnings("hiding") PNumericLiteral _numericLiteral_)
    {
        // Constructor
        setNumericLiteral(_numericLiteral_);

    }

    @Override
    public Object clone()
    {
        return new ANumericConstant(
            cloneNode(this._numericLiteral_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumericConstant(this);
    }

    public PNumericLiteral getNumericLiteral()
    {
        return this._numericLiteral_;
    }

    public void setNumericLiteral(PNumericLiteral node)
    {
        if(this._numericLiteral_ != null)
        {
            this._numericLiteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numericLiteral_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numericLiteral_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._numericLiteral_ == child)
        {
            this._numericLiteral_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._numericLiteral_ == oldChild)
        {
            setNumericLiteral((PNumericLiteral) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

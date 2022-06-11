/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AMulTerm extends PTerm
{
    private PTerm _term_;
    private TMulOperator _mulOperator_;
    private PPowerExpression _powerExpression_;

    public AMulTerm()
    {
        // Constructor
    }

    public AMulTerm(
        @SuppressWarnings("hiding") PTerm _term_,
        @SuppressWarnings("hiding") TMulOperator _mulOperator_,
        @SuppressWarnings("hiding") PPowerExpression _powerExpression_)
    {
        // Constructor
        setTerm(_term_);

        setMulOperator(_mulOperator_);

        setPowerExpression(_powerExpression_);

    }

    @Override
    public Object clone()
    {
        return new AMulTerm(
            cloneNode(this._term_),
            cloneNode(this._mulOperator_),
            cloneNode(this._powerExpression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMulTerm(this);
    }

    public PTerm getTerm()
    {
        return this._term_;
    }

    public void setTerm(PTerm node)
    {
        if(this._term_ != null)
        {
            this._term_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._term_ = node;
    }

    public TMulOperator getMulOperator()
    {
        return this._mulOperator_;
    }

    public void setMulOperator(TMulOperator node)
    {
        if(this._mulOperator_ != null)
        {
            this._mulOperator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mulOperator_ = node;
    }

    public PPowerExpression getPowerExpression()
    {
        return this._powerExpression_;
    }

    public void setPowerExpression(PPowerExpression node)
    {
        if(this._powerExpression_ != null)
        {
            this._powerExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._powerExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._term_)
            + toString(this._mulOperator_)
            + toString(this._powerExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._term_ == child)
        {
            this._term_ = null;
            return;
        }

        if(this._mulOperator_ == child)
        {
            this._mulOperator_ = null;
            return;
        }

        if(this._powerExpression_ == child)
        {
            this._powerExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._term_ == oldChild)
        {
            setTerm((PTerm) newChild);
            return;
        }

        if(this._mulOperator_ == oldChild)
        {
            setMulOperator((TMulOperator) newChild);
            return;
        }

        if(this._powerExpression_ == oldChild)
        {
            setPowerExpression((PPowerExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

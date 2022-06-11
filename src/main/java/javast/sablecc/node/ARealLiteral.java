/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ARealLiteral extends PRealLiteral
{
    private PRealTypeNameHashed _realTypeNameHashed_;
    private TSignedInteger _signedInteger_;
    private TDot _dot_;
    private TInteger _integer_;
    private TExponent _exponent_;

    public ARealLiteral()
    {
        // Constructor
    }

    public ARealLiteral(
        @SuppressWarnings("hiding") PRealTypeNameHashed _realTypeNameHashed_,
        @SuppressWarnings("hiding") TSignedInteger _signedInteger_,
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") TInteger _integer_,
        @SuppressWarnings("hiding") TExponent _exponent_)
    {
        // Constructor
        setRealTypeNameHashed(_realTypeNameHashed_);

        setSignedInteger(_signedInteger_);

        setDot(_dot_);

        setInteger(_integer_);

        setExponent(_exponent_);

    }

    @Override
    public Object clone()
    {
        return new ARealLiteral(
            cloneNode(this._realTypeNameHashed_),
            cloneNode(this._signedInteger_),
            cloneNode(this._dot_),
            cloneNode(this._integer_),
            cloneNode(this._exponent_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARealLiteral(this);
    }

    public PRealTypeNameHashed getRealTypeNameHashed()
    {
        return this._realTypeNameHashed_;
    }

    public void setRealTypeNameHashed(PRealTypeNameHashed node)
    {
        if(this._realTypeNameHashed_ != null)
        {
            this._realTypeNameHashed_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._realTypeNameHashed_ = node;
    }

    public TSignedInteger getSignedInteger()
    {
        return this._signedInteger_;
    }

    public void setSignedInteger(TSignedInteger node)
    {
        if(this._signedInteger_ != null)
        {
            this._signedInteger_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._signedInteger_ = node;
    }

    public TDot getDot()
    {
        return this._dot_;
    }

    public void setDot(TDot node)
    {
        if(this._dot_ != null)
        {
            this._dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dot_ = node;
    }

    public TInteger getInteger()
    {
        return this._integer_;
    }

    public void setInteger(TInteger node)
    {
        if(this._integer_ != null)
        {
            this._integer_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._integer_ = node;
    }

    public TExponent getExponent()
    {
        return this._exponent_;
    }

    public void setExponent(TExponent node)
    {
        if(this._exponent_ != null)
        {
            this._exponent_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exponent_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._realTypeNameHashed_)
            + toString(this._signedInteger_)
            + toString(this._dot_)
            + toString(this._integer_)
            + toString(this._exponent_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._realTypeNameHashed_ == child)
        {
            this._realTypeNameHashed_ = null;
            return;
        }

        if(this._signedInteger_ == child)
        {
            this._signedInteger_ = null;
            return;
        }

        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        if(this._integer_ == child)
        {
            this._integer_ = null;
            return;
        }

        if(this._exponent_ == child)
        {
            this._exponent_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._realTypeNameHashed_ == oldChild)
        {
            setRealTypeNameHashed((PRealTypeNameHashed) newChild);
            return;
        }

        if(this._signedInteger_ == oldChild)
        {
            setSignedInteger((TSignedInteger) newChild);
            return;
        }

        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(this._integer_ == oldChild)
        {
            setInteger((TInteger) newChild);
            return;
        }

        if(this._exponent_ == oldChild)
        {
            setExponent((TExponent) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

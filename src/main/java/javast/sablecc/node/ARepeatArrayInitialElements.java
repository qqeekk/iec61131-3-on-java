/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ARepeatArrayInitialElements extends PArrayInitialElements
{
    private TInteger _integer_;
    private TLparen _lparen_;
    private PInitialElement _initialElement_;
    private TRparen _rparen_;

    public ARepeatArrayInitialElements()
    {
        // Constructor
    }

    public ARepeatArrayInitialElements(
        @SuppressWarnings("hiding") TInteger _integer_,
        @SuppressWarnings("hiding") TLparen _lparen_,
        @SuppressWarnings("hiding") PInitialElement _initialElement_,
        @SuppressWarnings("hiding") TRparen _rparen_)
    {
        // Constructor
        setInteger(_integer_);

        setLparen(_lparen_);

        setInitialElement(_initialElement_);

        setRparen(_rparen_);

    }

    @Override
    public Object clone()
    {
        return new ARepeatArrayInitialElements(
            cloneNode(this._integer_),
            cloneNode(this._lparen_),
            cloneNode(this._initialElement_),
            cloneNode(this._rparen_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARepeatArrayInitialElements(this);
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

    public TLparen getLparen()
    {
        return this._lparen_;
    }

    public void setLparen(TLparen node)
    {
        if(this._lparen_ != null)
        {
            this._lparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lparen_ = node;
    }

    public PInitialElement getInitialElement()
    {
        return this._initialElement_;
    }

    public void setInitialElement(PInitialElement node)
    {
        if(this._initialElement_ != null)
        {
            this._initialElement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._initialElement_ = node;
    }

    public TRparen getRparen()
    {
        return this._rparen_;
    }

    public void setRparen(TRparen node)
    {
        if(this._rparen_ != null)
        {
            this._rparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rparen_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._integer_)
            + toString(this._lparen_)
            + toString(this._initialElement_)
            + toString(this._rparen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._integer_ == child)
        {
            this._integer_ = null;
            return;
        }

        if(this._lparen_ == child)
        {
            this._lparen_ = null;
            return;
        }

        if(this._initialElement_ == child)
        {
            this._initialElement_ = null;
            return;
        }

        if(this._rparen_ == child)
        {
            this._rparen_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._integer_ == oldChild)
        {
            setInteger((TInteger) newChild);
            return;
        }

        if(this._lparen_ == oldChild)
        {
            setLparen((TLparen) newChild);
            return;
        }

        if(this._initialElement_ == oldChild)
        {
            setInitialElement((PInitialElement) newChild);
            return;
        }

        if(this._rparen_ == oldChild)
        {
            setRparen((TRparen) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class ACaseElement extends PCaseElement
{
    private PCaseList _caseList_;
    private TColon _colon_;
    private PStatementList _statementList_;

    public ACaseElement()
    {
        // Constructor
    }

    public ACaseElement(
        @SuppressWarnings("hiding") PCaseList _caseList_,
        @SuppressWarnings("hiding") TColon _colon_,
        @SuppressWarnings("hiding") PStatementList _statementList_)
    {
        // Constructor
        setCaseList(_caseList_);

        setColon(_colon_);

        setStatementList(_statementList_);

    }

    @Override
    public Object clone()
    {
        return new ACaseElement(
            cloneNode(this._caseList_),
            cloneNode(this._colon_),
            cloneNode(this._statementList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACaseElement(this);
    }

    public PCaseList getCaseList()
    {
        return this._caseList_;
    }

    public void setCaseList(PCaseList node)
    {
        if(this._caseList_ != null)
        {
            this._caseList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._caseList_ = node;
    }

    public TColon getColon()
    {
        return this._colon_;
    }

    public void setColon(TColon node)
    {
        if(this._colon_ != null)
        {
            this._colon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colon_ = node;
    }

    public PStatementList getStatementList()
    {
        return this._statementList_;
    }

    public void setStatementList(PStatementList node)
    {
        if(this._statementList_ != null)
        {
            this._statementList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._statementList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._caseList_)
            + toString(this._colon_)
            + toString(this._statementList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._caseList_ == child)
        {
            this._caseList_ = null;
            return;
        }

        if(this._colon_ == child)
        {
            this._colon_ = null;
            return;
        }

        if(this._statementList_ == child)
        {
            this._statementList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._caseList_ == oldChild)
        {
            setCaseList((PCaseList) newChild);
            return;
        }

        if(this._colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        if(this._statementList_ == oldChild)
        {
            setStatementList((PStatementList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
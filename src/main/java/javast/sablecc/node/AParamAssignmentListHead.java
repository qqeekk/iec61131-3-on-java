/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AParamAssignmentListHead extends PParamAssignmentListHead
{
    private PParamAssignment _paramAssignment_;
    private TComma _comma_;

    public AParamAssignmentListHead()
    {
        // Constructor
    }

    public AParamAssignmentListHead(
        @SuppressWarnings("hiding") PParamAssignment _paramAssignment_,
        @SuppressWarnings("hiding") TComma _comma_)
    {
        // Constructor
        setParamAssignment(_paramAssignment_);

        setComma(_comma_);

    }

    @Override
    public Object clone()
    {
        return new AParamAssignmentListHead(
            cloneNode(this._paramAssignment_),
            cloneNode(this._comma_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParamAssignmentListHead(this);
    }

    public PParamAssignment getParamAssignment()
    {
        return this._paramAssignment_;
    }

    public void setParamAssignment(PParamAssignment node)
    {
        if(this._paramAssignment_ != null)
        {
            this._paramAssignment_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._paramAssignment_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._paramAssignment_)
            + toString(this._comma_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._paramAssignment_ == child)
        {
            this._paramAssignment_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._paramAssignment_ == oldChild)
        {
            setParamAssignment((PParamAssignment) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

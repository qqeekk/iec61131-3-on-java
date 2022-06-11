/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AExitIterationStatement extends PIterationStatement
{
    private PExitStatement _exitStatement_;

    public AExitIterationStatement()
    {
        // Constructor
    }

    public AExitIterationStatement(
        @SuppressWarnings("hiding") PExitStatement _exitStatement_)
    {
        // Constructor
        setExitStatement(_exitStatement_);

    }

    @Override
    public Object clone()
    {
        return new AExitIterationStatement(
            cloneNode(this._exitStatement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExitIterationStatement(this);
    }

    public PExitStatement getExitStatement()
    {
        return this._exitStatement_;
    }

    public void setExitStatement(PExitStatement node)
    {
        if(this._exitStatement_ != null)
        {
            this._exitStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exitStatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exitStatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exitStatement_ == child)
        {
            this._exitStatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exitStatement_ == oldChild)
        {
            setExitStatement((PExitStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AIterStatement extends PStatement
{
    private PIterationStatement _iterationStatement_;

    public AIterStatement()
    {
        // Constructor
    }

    public AIterStatement(
        @SuppressWarnings("hiding") PIterationStatement _iterationStatement_)
    {
        // Constructor
        setIterationStatement(_iterationStatement_);

    }

    @Override
    public Object clone()
    {
        return new AIterStatement(
            cloneNode(this._iterationStatement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIterStatement(this);
    }

    public PIterationStatement getIterationStatement()
    {
        return this._iterationStatement_;
    }

    public void setIterationStatement(PIterationStatement node)
    {
        if(this._iterationStatement_ != null)
        {
            this._iterationStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._iterationStatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._iterationStatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._iterationStatement_ == child)
        {
            this._iterationStatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._iterationStatement_ == oldChild)
        {
            setIterationStatement((PIterationStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

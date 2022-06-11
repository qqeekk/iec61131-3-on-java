/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AExitStatement extends PExitStatement
{
    private TExitToken _exitToken_;

    public AExitStatement()
    {
        // Constructor
    }

    public AExitStatement(
        @SuppressWarnings("hiding") TExitToken _exitToken_)
    {
        // Constructor
        setExitToken(_exitToken_);

    }

    @Override
    public Object clone()
    {
        return new AExitStatement(
            cloneNode(this._exitToken_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExitStatement(this);
    }

    public TExitToken getExitToken()
    {
        return this._exitToken_;
    }

    public void setExitToken(TExitToken node)
    {
        if(this._exitToken_ != null)
        {
            this._exitToken_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exitToken_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exitToken_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exitToken_ == child)
        {
            this._exitToken_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exitToken_ == oldChild)
        {
            setExitToken((TExitToken) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
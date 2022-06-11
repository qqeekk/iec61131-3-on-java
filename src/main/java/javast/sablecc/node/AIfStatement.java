/* This file was generated by SableCC (http://www.sablecc.org/). */

package javast.sablecc.node;

import java.util.*;
import javast.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AIfStatement extends PIfStatement
{
    private TIfToken _ifToken_;
    private PExpression _expression_;
    private TThenToken _thenToken_;
    private PStatementList _statementList_;
    private final LinkedList<PElseifStatement> _elseifStatement_ = new LinkedList<PElseifStatement>();
    private final LinkedList<PElseStatement> _elseStatement_ = new LinkedList<PElseStatement>();
    private TEndIfToken _endIfToken_;

    public AIfStatement()
    {
        // Constructor
    }

    public AIfStatement(
        @SuppressWarnings("hiding") TIfToken _ifToken_,
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") TThenToken _thenToken_,
        @SuppressWarnings("hiding") PStatementList _statementList_,
        @SuppressWarnings("hiding") List<?> _elseifStatement_,
        @SuppressWarnings("hiding") List<?> _elseStatement_,
        @SuppressWarnings("hiding") TEndIfToken _endIfToken_)
    {
        // Constructor
        setIfToken(_ifToken_);

        setExpression(_expression_);

        setThenToken(_thenToken_);

        setStatementList(_statementList_);

        setElseifStatement(_elseifStatement_);

        setElseStatement(_elseStatement_);

        setEndIfToken(_endIfToken_);

    }

    @Override
    public Object clone()
    {
        return new AIfStatement(
            cloneNode(this._ifToken_),
            cloneNode(this._expression_),
            cloneNode(this._thenToken_),
            cloneNode(this._statementList_),
            cloneList(this._elseifStatement_),
            cloneList(this._elseStatement_),
            cloneNode(this._endIfToken_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfStatement(this);
    }

    public TIfToken getIfToken()
    {
        return this._ifToken_;
    }

    public void setIfToken(TIfToken node)
    {
        if(this._ifToken_ != null)
        {
            this._ifToken_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ifToken_ = node;
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    public TThenToken getThenToken()
    {
        return this._thenToken_;
    }

    public void setThenToken(TThenToken node)
    {
        if(this._thenToken_ != null)
        {
            this._thenToken_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._thenToken_ = node;
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

    public LinkedList<PElseifStatement> getElseifStatement()
    {
        return this._elseifStatement_;
    }

    public void setElseifStatement(List<?> list)
    {
        for(PElseifStatement e : this._elseifStatement_)
        {
            e.parent(null);
        }
        this._elseifStatement_.clear();

        for(Object obj_e : list)
        {
            PElseifStatement e = (PElseifStatement) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._elseifStatement_.add(e);
        }
    }

    public LinkedList<PElseStatement> getElseStatement()
    {
        return this._elseStatement_;
    }

    public void setElseStatement(List<?> list)
    {
        for(PElseStatement e : this._elseStatement_)
        {
            e.parent(null);
        }
        this._elseStatement_.clear();

        for(Object obj_e : list)
        {
            PElseStatement e = (PElseStatement) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._elseStatement_.add(e);
        }
    }

    public TEndIfToken getEndIfToken()
    {
        return this._endIfToken_;
    }

    public void setEndIfToken(TEndIfToken node)
    {
        if(this._endIfToken_ != null)
        {
            this._endIfToken_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._endIfToken_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ifToken_)
            + toString(this._expression_)
            + toString(this._thenToken_)
            + toString(this._statementList_)
            + toString(this._elseifStatement_)
            + toString(this._elseStatement_)
            + toString(this._endIfToken_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ifToken_ == child)
        {
            this._ifToken_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._thenToken_ == child)
        {
            this._thenToken_ = null;
            return;
        }

        if(this._statementList_ == child)
        {
            this._statementList_ = null;
            return;
        }

        if(this._elseifStatement_.remove(child))
        {
            return;
        }

        if(this._elseStatement_.remove(child))
        {
            return;
        }

        if(this._endIfToken_ == child)
        {
            this._endIfToken_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ifToken_ == oldChild)
        {
            setIfToken((TIfToken) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(this._thenToken_ == oldChild)
        {
            setThenToken((TThenToken) newChild);
            return;
        }

        if(this._statementList_ == oldChild)
        {
            setStatementList((PStatementList) newChild);
            return;
        }

        for(ListIterator<PElseifStatement> i = this._elseifStatement_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PElseifStatement) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PElseStatement> i = this._elseStatement_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PElseStatement) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._endIfToken_ == oldChild)
        {
            setEndIfToken((TEndIfToken) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
/* Generated By:JJTree: Do not edit this line. ASTcompoundStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=wci.intermediate.icodeimpl.ICodeNodeImpl,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package wci.frontend;

public
class ASTcompoundStatement extends SimpleNode {
  public ASTcompoundStatement(int id) {
    super(id);
  }

  public ASTcompoundStatement(CdbParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CdbParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=01f61cedea5c1a6eefd19f3718823125 (do not edit this line) */
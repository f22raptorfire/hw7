/* Generated By:JJTree: Do not edit this line. ASTrealConstant.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=wci.intermediate.icodeimpl.ICodeNodeImpl,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package wci.frontend;

public
class ASTrealConstant extends SimpleNode {
  public ASTrealConstant(int id) {
    super(id);
  }

  public ASTrealConstant(CdbParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CdbParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=7f55c6c1c53b3b48ce049d66a8c8b63c (do not edit this line) */

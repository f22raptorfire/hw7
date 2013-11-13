/* Generated By:JavaCC: Do not edit this line. CdbParserVisitor.java Version 5.0 */
package wci.frontend;

public interface CdbParserVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTscript node, Object data);
  public Object visit(ASTcompoundStatement node, Object data);
  public Object visit(ASTwhileLoop node, Object data);
  public Object visit(ASTforLoop node, Object data);
  public Object visit(ASTdoLoop node, Object data);
  public Object visit(ASTifStatement node, Object data);
  public Object visit(ASTassignment node, Object data);
  public Object visit(ASTEE node, Object data);
  public Object visit(ASTNE node, Object data);
  public Object visit(ASTLT node, Object data);
  public Object visit(ASTLE node, Object data);
  public Object visit(ASTGT node, Object data);
  public Object visit(ASTGE node, Object data);
  public Object visit(ASTadd node, Object data);
  public Object visit(ASTsubtract node, Object data);
  public Object visit(ASTmultiply node, Object data);
  public Object visit(ASTdivide node, Object data);
  public Object visit(ASTvariable node, Object data);
  public Object visit(ASTintegerConstant node, Object data);
  public Object visit(ASTrealConstant node, Object data);
}
/* JavaCC - OriginalChecksum=60e83d8abc583419e4cb8e5d313c5144 (do not edit this line) */
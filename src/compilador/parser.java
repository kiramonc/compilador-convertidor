
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Feb 10 08:36:33 COT 2015
//----------------------------------------------------

package compilador;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Feb 10 08:36:33 COT 2015
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\010\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\007\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\016\000\004\012\004\001\002\000\012\005\012\006" +
    "\013\007\015\010\014\001\002\000\006\002\010\012\004" +
    "\001\002\000\006\002\uffff\012\uffff\001\002\000\006\002" +
    "\001\012\001\001\002\000\004\002\000\001\002\000\004" +
    "\011\016\001\002\000\006\004\ufffd\011\ufffd\001\002\000" +
    "\006\004\ufffc\011\ufffc\001\002\000\006\004\ufffa\011\ufffa" +
    "\001\002\000\006\004\ufffb\011\ufffb\001\002\000\012\005" +
    "\012\006\013\007\015\010\014\001\002\000\004\004\020" +
    "\001\002\000\006\002\ufffe\012\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\016\000\006\002\004\003\005\001\001\000\004\004" +
    "\010\001\001\000\004\003\006\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\004\016\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public void report_error(String message, Object info) {
        StringBuffer m = new StringBuffer("Error");
        System.out.println("Mensaje: " + message);
        if (info instanceof java_cup.runtime.Symbol) {
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
            /* Comprueba si el numero de línea es mayor o igual que cero */
            if (s.left >= 0) {
                m.append(" en linea " + (s.left));
                /*Comprueba si el numero de columna es mayoro igual que cero */
                if (s.right >= 0) {
                    m.append(", y columna " + (s.right + 1));
                }
            }
            if (info.toString().equals("#7") || info.toString().equals("#2")) {
                m.append("\nSe esperaba una unidad 'm', 'cm', 'ft', 'in'");
            } else {
                if (info.toString().equals("#3")||info.toString().equals("#6")||info.toString().equals("#5")||info.toString().equals("#4")) {
                    if(s.left>=0&&s.left<4)
                        m.append("\nSe esperaba un número");
                    else
                        m.append("\nSe esperaba operador '*'");
                } else {
                    if (info.toString().equals("#0")) {
                        m.append("\nSe esperaba fin de línea ';'");
                    }
                }
            }

        }
        m.append(" : " + message);
        System.err.println(m);
    }

    public void report_fatal_error(String message, Object info) {
       	//report_error(message, info);
    }

public String conversion(String entrada, String salida, Double n){
	Double a=0.0,b=0.0;
        String respuesta= n+" "+entrada;	
	if (entrada=="m") a=n;
	else if (entrada=="cm")a=n*0.01; 
	else if (entrada=="ft") a=n*0.3048;	 
	else if (entrada=="in") a=n*0.0254;	 
	
	if (salida=="m") b=a;
	else if (salida=="cm") b=a*100;
	else if (salida=="ft") b=a*3.2808399;
	else if (salida=="in") b=a*39.3700787;
	return respuesta +" equivale a "+b+" "+salida+" ";
}




}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // unidad ::= PIES 
            {
              Object RESULT =null;
		RESULT= "ft";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("unidad",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // unidad ::= PULGADAS 
            {
              Object RESULT =null;
		RESULT= "in";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("unidad",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // unidad ::= CENTIMETRO 
            {
              Object RESULT =null;
		RESULT= "cm";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("unidad",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // unidad ::= METRO 
            {
              Object RESULT =null;
		RESULT= "m";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("unidad",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // linea ::= NUMERO unidad CONVERTIR unidad SALTO 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		System.out.println(parser.conversion(e.toString(), s.toString(), n));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("linea",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // sentencia ::= linea 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentencia",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= sentencia EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // sentencia ::= sentencia linea 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentencia",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}


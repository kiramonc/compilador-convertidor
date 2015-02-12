package compilador;
import static compilador.Token.*;
import java_cup.runtime.*;


%%
%cup
%full
%line
%char
%ignorecase
%eofval{
	return new Symbol(sym.EOF,new String("Fin del archivo"));
%eofval}


D=[0-9]+("."[0-9]+)?
white=[ ,\n]

/*%{Crear un nuevo objeto java_cup.runtime.Symbol con información sobre el token actual sin valor
public String lexeme;
  private Symbol symbol(int type){
    return new Symbol(type,yyline,yycolumn);
  }
Crear un nuevo objeto java_cup.runtime.Symbol con información sobre el token actual con valor
  private Symbol symbol(int type,Object value){
    return new Symbol(type,yyline,yycolumn,value);
  }
%}*/

%%
{white} {/*Ignore*/}
"//".* {/*Ignore*/}
"m" {return new Symbol(sym.METRO, yychar, yyline, yytext());}
"cm" {return new Symbol(sym.CENTIMETRO, yychar, yyline, yytext());}
"ft" {return new Symbol(sym.PIES, yychar, yyline, yytext());}
"in" {return new Symbol(sym.PULGADAS, yychar, yyline, yytext());}
"*" {return new Symbol(sym.CONVERTIR, yychar, yyline, yytext());}
";" {return new Symbol(sym.SALTO, yychar, yyline, yytext());}
{D} {return new Symbol(sym.NUMERO, yychar, yyline, new Double(yytext()));}
. {System.out.println("Caracter ilegal: " + yytext());}

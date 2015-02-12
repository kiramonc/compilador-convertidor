package compilador;
import static compilador.Token.*;
import java_cup.runtime.*;

%%
%class Lexer
%type Token
%line
%column
%cup



D=[0-9]+("."[0-9]+)?
white=[ ,\n]

%{/*Crear un nuevo objeto java_cup.runtime.Symbol con información sobre el token actual sin valor*/
public String lexeme;
  /*private Symbol symbol(int type){
    return new Symbol(type,yyline,yycolumn);
  }
/* Crear un nuevo objeto java_cup.runtime.Symbol con información sobre el token actual con valor
  private Symbol symbol(int type,Object value){
    return new Symbol(type,yyline,yycolumn,value);
  }*/
%}

%%
{white} {/*Ignore*/}
"//".* {/*Ignore*/}
"m" {return metro;}
"cm" {return centimetro;}
"ft" {return pies;}
"in" {return pulgadas;}
"*" {return convertir;}
";" {return salto;}
{D} {lexeme=yytext();return Numero;}
. {return ERROR;}

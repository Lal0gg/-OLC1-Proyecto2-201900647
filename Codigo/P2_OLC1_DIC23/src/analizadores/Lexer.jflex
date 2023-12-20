// ------------  Paquetes e importaciones ------------
package analizadores; 
import clases.Erroor;
import clases.Token;
import func.Funcion;
import static func.Funcion.TokenList;
import static func.Funcion.ErrorList;


import java_cup.runtime.*;

%%	
//-------> Directivas (No tocar)

%public 
%class Lexer
%cup
%char
%line
%column
%unicode
%ignorecase


%init{ 
    yyline = 1;
    yycolumn =1;
%init} 

// ------> Expresiones Regulares 

JenteroJ =[0-9]+ 
JdecimalJ =([0-9]+\.[0-9]+|[0-9]+)
JcadenaJ = [\"][^\"\n]*[\"]
JcomentariomultilineaJ =[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
JcomentariolineaJ =\/\/[^\n]*
JercharJ =\'[a-zA-ZñÑ]\'
JidentificadorJ = [a-z][a-z0-9_]*


%%

// ------------  Reglas Lexicas -------------------

// -------->  Palabras Reservadas  = 19
"void"                  {Token NuevoToken = new Token("TkResVOID",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResVOID> Tk: " + yytext());return new Symbol(sym.TkResVOID, yycolumn, yyline, yytext()); }
"entero"                {Token NuevoToken = new Token("TkResENTERO",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResENTERO> Tk: " + yytext());return new Symbol(sym.TkResENTERO, yycolumn, yyline, yytext()); }
"doble"                 {Token NuevoToken = new Token("TkResDOBLE",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResDOBLE> Tk: " + yytext());return new Symbol(sym.TkResDOBLE, yycolumn, yyline, yytext()); }
"binario"               {Token NuevoToken = new Token("TkResBINARIO",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResBINARIO> Tk: " + yytext());return new Symbol(sym.TkResBINARIO, yycolumn, yyline, yytext()); }
"caracter"              {Token NuevoToken = new Token("TkResCARACTER",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResCARACTER> Tk: " + yytext());return new Symbol(sym.TkResCARACTER, yycolumn, yyline, yytext()); }
"cadena"                {Token NuevoToken = new Token("TkResCADENA",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResCADENA> Tk: " + yytext());return new Symbol(sym.TkResCADENA, yycolumn, yyline, yytext()); }
"si"                    {Token NuevoToken = new Token("TkResSI",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResSI> Tk: " + yytext());return new Symbol(sym.TkResSI, yycolumn, yyline, yytext()); }
"sino"                  {Token NuevoToken = new Token("TkResSINO",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResSINO> Tk: " + yytext());return new Symbol(sym.TkResSINO, yycolumn, yyline, yytext()); }
"imprimir"              {Token NuevoToken = new Token("TkResIMPRIMIR",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResIMPRIMIR> Tk: " + yytext());return new Symbol(sym.TkResIMPRIMIR, yycolumn, yyline, yytext()); }
"mientras"              {Token NuevoToken = new Token("TkResMIENTRAS",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResMIENTRAS> Tk: " + yytext());return new Symbol(sym.TkResMIENTRAS, yycolumn, yyline, yytext()); }
"para"                  {Token NuevoToken = new Token("TkResPARA",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResPARA> Tk: " + yytext());return new Symbol(sym.TkResPARA, yycolumn, yyline, yytext()); }
"hacer"                 {Token NuevoToken = new Token("TkResHACER",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResHACER> Tk: " + yytext());return new Symbol(sym.TkResHACER, yycolumn, yyline, yytext()); }
"ejecutar"              {Token NuevoToken = new Token("TkResEJECUTAR",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResEJECUTAR> Tk: " + yytext());return new Symbol(sym.TkResEJECUTAR, yycolumn, yyline, yytext()); }
"cortar"                {Token NuevoToken = new Token("TkResCORTAR",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResCORTAR> Tk: " + yytext());return new Symbol(sym.TkResCORTAR, yycolumn, yyline, yytext()); }
"continuar"             {Token NuevoToken = new Token("TkResCONTINUAR",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResCONTINUAR> Tk: " + yytext());return new Symbol(sym.TkResCONTINUAR, yycolumn, yyline, yytext()); }
"retorno"               {Token NuevoToken = new Token("TkResRETORNO",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResRETORNO> Tk: " + yytext());return new Symbol(sym.TkResRETORNO, yycolumn, yyline, yytext()); }
"redondeo"              {Token NuevoToken = new Token("TkResREDONDEO",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResREDONDEO> Tk: " + yytext());return new Symbol(sym.TkResREDONDEO, yycolumn, yyline, yytext()); }
"longitud"              {Token NuevoToken = new Token("TkResLONGITUD",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResLONGITUD> Tk: " + yytext());return new Symbol(sym.TkResLONGITUD, yycolumn, yyline, yytext()); }
"aCadena"               {Token NuevoToken = new Token("TkResACADENA",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkResACADENA> Tk: " + yytext());return new Symbol(sym.TkResACADENA, yycolumn, yyline, yytext()); }



// --------> Simbolos  = 27
"+"                 {Token NuevoToken = new Token("TkSimMAS",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimMAS> Tk: " + yytext());return new Symbol(sym.TkSimMAS, yycolumn, yyline, yytext()); }
"-"                 {Token NuevoToken = new Token("TkSimRESTA",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimRESTA> Tk: " + yytext());return new Symbol(sym.TkSimRESTA, yycolumn, yyline, yytext()); }
"*"                 {Token NuevoToken = new Token("TkSimMULTIPLICACION",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimMULTIPLICACION> Tk: " + yytext());return new Symbol(sym.TkSimMULTIPLICACION, yycolumn, yyline, yytext()); }
"/"                 {Token NuevoToken = new Token("TkSimDIVISION",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimDIVISION> Tk: " + yytext());return new Symbol(sym.TkSimDIVISION, yycolumn, yyline, yytext()); }
"^"                 {Token NuevoToken = new Token("TkSimMPOTENCIA",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimMPOTENCIA> Tk: " + yytext());return new Symbol(sym.TkSimMPOTENCIA, yycolumn, yyline, yytext()); }
"%"                 {Token NuevoToken = new Token("TkSimMODULO",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimMODULO> Tk: " + yytext());return new Symbol(sym.TkSimMODULO, yycolumn, yyline, yytext()); }

"("                 {Token NuevoToken = new Token("TkSimPARENTESISAbre",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimPARENTESISAbre> Tk: " + yytext());return new Symbol(sym.TkSimPARENTESISAbre, yycolumn, yyline, yytext()); }
")"                 {Token NuevoToken = new Token("TkSimPARENTESISCierra",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimPARENTESISCierra> Tk: " + yytext());return new Symbol(sym.TkSimPARENTESISCierra, yycolumn, yyline, yytext()); }
"{"                 {Token NuevoToken = new Token("TkSimLLAVEAbre",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimLLAVEAbre> Tk: " + yytext());return new Symbol(sym.TkSimLLAVEAbre, yycolumn, yyline, yytext()); }
"}"                 {Token NuevoToken = new Token("TkSimLLAVECierra",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimLLAVECierra> Tk: " + yytext());return new Symbol(sym.TkSimLLAVECierra, yycolumn, yyline, yytext()); }
"["                 {Token NuevoToken = new Token("TkSimCORCHETEAbre",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimCORCHETEAbre> Tk: " + yytext());return new Symbol(sym.TkSimCORCHETEAbre, yycolumn, yyline, yytext());}
"]"                 {Token NuevoToken = new Token("TkSimCORCHETECierra",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimCORCHETECierra> Tk: " + yytext());return new Symbol(sym.TkSimCORCHETECierra, yycolumn, yyline, yytext());}
"[]"                {Token NuevoToken = new Token("TkSimCorchetesArreglo",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimCorchetesArreglo> Tk: " + yytext());return new Symbol(sym.TkSimCorchetesArreglo, yycolumn, yyline, yytext());}


"=="                {Token NuevoToken = new Token("TkSimIGUALIGUAL",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimIGUALIGUAL> Tk: " + yytext());return new Symbol(sym.TkSimIGUALIGUAL, yycolumn, yyline, yytext()); }
"!="                {Token NuevoToken = new Token("TkSimDIFERENTE",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimDIFERENTE> Tk: " + yytext());return new Symbol(sym.TkSimDIFERENTE, yycolumn, yyline, yytext()); }
"<"                 {Token NuevoToken = new Token("TkSimMENOR",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimMENOR> Tk: " + yytext());return new Symbol(sym.TkSimMENOR, yycolumn, yyline, yytext()); }
"<="                {Token NuevoToken = new Token("TkSimMENORIGUAL",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimMENORIGUAL> Tk: " + yytext());return new Symbol(sym.TkSimMENORIGUAL, yycolumn, yyline, yytext()); }
">"                 {Token NuevoToken = new Token("TkSimMAYOR",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimMAYOR> Tk: " + yytext());return new Symbol(sym.TkSimMAYOR, yycolumn, yyline, yytext()); }
">="                {Token NuevoToken = new Token("TkSimMAYORIGUAL",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimMAYORIGUAL> Tk: " + yytext());return new Symbol(sym.TkSimMAYORIGUAL, yycolumn, yyline, yytext()); }



"||"                {Token NuevoToken = new Token("TkSimOR",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimOR> Tk: " + yytext());return new Symbol(sym.TkSimOR, yycolumn, yyline, yytext()); }
"&&"                {Token NuevoToken = new Token("TkSimAND",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimAND> Tk: " + yytext());return new Symbol(sym.TkSimAND, yycolumn, yyline, yytext()); }
"!"                 {Token NuevoToken = new Token("TkSimINOT",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimINOT> Tk: " + yytext());return new Symbol(sym.TkSimINOT, yycolumn, yyline, yytext()); }

";"                 {Token NuevoToken = new Token("TkSimPUNTOYCOMA",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimPUNTOYCOMA> Tk: " + yytext());return new Symbol(sym.TkSimPUNTOYCOMA, yycolumn, yyline, yytext());}
":"                 {Token NuevoToken = new Token("TkSimDOSPUNTOS",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimDOSPUNTOS> Tk: " + yytext());return new Symbol(sym.TkSimDOSPUNTOS, yycolumn, yyline, yytext());}
"."                 {Token NuevoToken = new Token("TkSimPUNTO",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimPUNTO> Tk: " + yytext());return new Symbol(sym.TkSimPUNTO, yycolumn, yyline, yytext());}
","                 {Token NuevoToken = new Token("TkSimCOMA",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimPUNTO> Tk: " + yytext());return new Symbol(sym.TkSimPUNTO, yycolumn, yyline, yytext());}
"="                 {Token NuevoToken = new Token("TkSimIGUAL",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkSimIGUAL> Tk: " + yytext());return new Symbol(sym.TkSimIGUAL, yycolumn, yyline, yytext());}





// --------> Expresiones regulares = 7
{JenteroJ}                {Token NuevoToken = new Token("TkJENTERO",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkJENTERO> Tk: " + yytext());return new Symbol(sym.TkJENTERO, yycolumn, yyline, yytext()); }
{JdecimalJ}               {Token NuevoToken = new Token("TkJDECIMAL",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkJDECIMAL> Tk: " + yytext());return new Symbol(sym.TkJDECIMAL, yycolumn, yyline, yytext());}
{JcomentariomultilineaJ}  {/*se ignoran comentarios multilinea */}
{JcomentariolineaJ}       {/*se ignoran comentarios de una linea */}
{JcadenaJ}                {Token NuevoToken = new Token("TkJCADENA",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkJCADENA> Tk: " + yytext());return new Symbol(sym.TkJCADENA, yycolumn, yyline, yytext());}
{JercharJ}                {Token NuevoToken = new Token("TkJErChar",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkJErChar> Tk: " + yytext());return new Symbol(sym.TkJErChar, yycolumn, yyline, yytext());}
{JidentificadorJ}         {Token NuevoToken = new Token("TkJIdentificador",yytext(),yyline,yycolumn);Funcion.TokenList.add(NuevoToken);System.out.println("Se acepto el Token  <TkJIdentificador> Tk: " + yytext());return new Symbol(sym.TkJIdentificador, yycolumn, yyline, yytext());}





//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{Erroor errorsito = new Erroor("Lexico", yytext() ,"No es válido en este lenguaje", yyline, yycolumn);Funcion.ErrorList.add(errorsito);System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }


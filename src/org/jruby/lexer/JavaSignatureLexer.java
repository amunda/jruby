/* The following code was generated by JFlex 1.4.3 on 3/4/10 4:27 PM */

package org.jruby.lexer;

import org.jruby.parser.JavaSignatureParser;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/4/10 4:27 PM from the specification file
 * <tt>src/org/jruby/lexer/JavaSignatureLexer.flex</tt>
 */
public class JavaSignatureLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\5\1\3\1\2\1\0\1\3\1\1\16\5\4\0\1\3\3\0"+
    "\1\4\1\0\1\32\1\0\1\36\1\37\2\0\1\34\1\0\1\33"+
    "\1\0\12\5\2\0\1\43\1\0\1\44\1\42\1\0\32\4\1\40"+
    "\1\0\1\41\1\0\1\4\1\0\1\12\1\6\1\23\1\25\1\11"+
    "\1\24\1\22\1\17\1\21\2\4\1\10\1\4\1\13\1\7\1\30"+
    "\1\4\1\20\1\16\1\15\1\26\1\27\1\45\1\46\1\14\1\31"+
    "\4\0\41\5\2\0\4\4\4\0\1\4\2\0\1\5\7\0\1\4"+
    "\4\0\1\4\5\0\27\4\1\0\37\4\1\0\u013f\4\31\0\162\4"+
    "\4\0\14\4\16\0\5\4\11\0\1\4\21\0\130\5\5\0\23\5"+
    "\12\0\1\4\13\0\1\4\1\0\3\4\1\0\1\4\1\0\24\4"+
    "\1\0\54\4\1\0\46\4\1\0\5\4\4\0\202\4\1\0\4\5"+
    "\3\0\105\4\1\0\46\4\2\0\2\4\6\0\20\4\41\0\46\4"+
    "\2\0\1\4\7\0\47\4\11\0\21\5\1\0\27\5\1\0\3\5"+
    "\1\0\1\5\1\0\2\5\1\0\1\5\13\0\33\4\5\0\3\4"+
    "\15\0\4\5\14\0\6\5\13\0\32\4\5\0\13\4\16\5\7\0"+
    "\12\5\4\0\2\4\1\5\143\4\1\0\1\4\10\5\1\0\6\5"+
    "\2\4\2\5\1\0\4\5\2\4\12\5\3\4\2\0\1\4\17\0"+
    "\1\5\1\4\1\5\36\4\33\5\2\0\3\4\60\0\46\4\13\5"+
    "\1\4\u014f\0\3\5\66\4\2\0\1\5\1\4\20\5\2\0\1\4"+
    "\4\5\3\0\12\4\2\5\2\0\12\5\21\0\3\5\1\0\10\4"+
    "\2\0\2\4\2\0\26\4\1\0\7\4\1\0\1\4\3\0\4\4"+
    "\2\0\1\5\1\4\7\5\2\0\2\5\2\0\3\5\11\0\1\5"+
    "\4\0\2\4\1\0\3\4\2\5\2\0\12\5\4\4\15\0\3\5"+
    "\1\0\6\4\4\0\2\4\2\0\26\4\1\0\7\4\1\0\2\4"+
    "\1\0\2\4\1\0\2\4\2\0\1\5\1\0\5\5\4\0\2\5"+
    "\2\0\3\5\13\0\4\4\1\0\1\4\7\0\14\5\3\4\14\0"+
    "\3\5\1\0\11\4\1\0\3\4\1\0\26\4\1\0\7\4\1\0"+
    "\2\4\1\0\5\4\2\0\1\5\1\4\10\5\1\0\3\5\1\0"+
    "\3\5\2\0\1\4\17\0\2\4\2\5\2\0\12\5\1\0\1\4"+
    "\17\0\3\5\1\0\10\4\2\0\2\4\2\0\26\4\1\0\7\4"+
    "\1\0\2\4\1\0\5\4\2\0\1\5\1\4\6\5\3\0\2\5"+
    "\2\0\3\5\10\0\2\5\4\0\2\4\1\0\3\4\4\0\12\5"+
    "\1\0\1\4\20\0\1\5\1\4\1\0\6\4\3\0\3\4\1\0"+
    "\4\4\3\0\2\4\1\0\1\4\1\0\2\4\3\0\2\4\3\0"+
    "\3\4\3\0\10\4\1\0\3\4\4\0\5\5\3\0\3\5\1\0"+
    "\4\5\11\0\1\5\17\0\11\5\11\0\1\4\7\0\3\5\1\0"+
    "\10\4\1\0\3\4\1\0\27\4\1\0\12\4\1\0\5\4\4\0"+
    "\7\5\1\0\3\5\1\0\4\5\7\0\2\5\11\0\2\4\4\0"+
    "\12\5\22\0\2\5\1\0\10\4\1\0\3\4\1\0\27\4\1\0"+
    "\12\4\1\0\5\4\2\0\1\5\1\4\7\5\1\0\3\5\1\0"+
    "\4\5\7\0\2\5\7\0\1\4\1\0\2\4\4\0\12\5\22\0"+
    "\2\5\1\0\10\4\1\0\3\4\1\0\27\4\1\0\20\4\4\0"+
    "\6\5\2\0\3\5\1\0\4\5\11\0\1\5\10\0\2\4\4\0"+
    "\12\5\22\0\2\5\1\0\22\4\3\0\30\4\1\0\11\4\1\0"+
    "\1\4\2\0\7\4\3\0\1\5\4\0\6\5\1\0\1\5\1\0"+
    "\10\5\22\0\2\5\15\0\60\4\1\5\2\4\7\5\4\0\10\4"+
    "\10\5\1\0\12\5\47\0\2\4\1\0\1\4\2\0\2\4\1\0"+
    "\1\4\2\0\1\4\6\0\4\4\1\0\7\4\1\0\3\4\1\0"+
    "\1\4\1\0\1\4\2\0\2\4\1\0\4\4\1\5\2\4\6\5"+
    "\1\0\2\5\1\4\2\0\5\4\1\0\1\4\1\0\6\5\2\0"+
    "\12\5\2\0\2\4\42\0\1\4\27\0\2\5\6\0\12\5\13\0"+
    "\1\5\1\0\1\5\1\0\1\5\4\0\2\5\10\4\1\0\42\4"+
    "\6\0\24\5\1\0\2\5\4\4\4\0\10\5\1\0\44\5\11\0"+
    "\1\5\71\0\42\4\1\0\5\4\1\0\2\4\1\0\7\5\3\0"+
    "\4\5\6\0\12\5\6\0\6\4\4\5\106\0\46\4\12\0\51\4"+
    "\7\0\132\4\5\0\104\4\5\0\122\4\6\0\7\4\1\0\77\4"+
    "\1\0\1\4\1\0\4\4\2\0\7\4\1\0\1\4\1\0\4\4"+
    "\2\0\47\4\1\0\1\4\1\0\4\4\2\0\37\4\1\0\1\4"+
    "\1\0\4\4\2\0\7\4\1\0\1\4\1\0\4\4\2\0\7\4"+
    "\1\0\7\4\1\0\27\4\1\0\37\4\1\0\1\4\1\0\4\4"+
    "\2\0\7\4\1\0\47\4\1\0\23\4\16\0\11\5\56\0\125\4"+
    "\14\0\u026c\4\2\0\10\4\12\0\32\4\5\0\113\4\3\0\3\4"+
    "\17\0\15\4\1\0\4\4\3\5\13\0\22\4\3\5\13\0\22\4"+
    "\2\5\14\0\15\4\1\0\3\4\1\0\2\5\14\0\64\4\40\5"+
    "\3\0\1\4\3\0\2\4\1\5\2\0\12\5\41\0\3\5\2\0"+
    "\12\5\6\0\130\4\10\0\51\4\1\5\126\0\35\4\3\0\14\5"+
    "\4\0\14\5\12\0\12\5\36\4\2\0\5\4\u038b\0\154\4\224\0"+
    "\234\4\4\0\132\4\6\0\26\4\2\0\6\4\2\0\46\4\2\0"+
    "\6\4\2\0\10\4\1\0\1\4\1\0\1\4\1\0\1\4\1\0"+
    "\37\4\2\0\65\4\1\0\7\4\1\0\1\4\3\0\3\4\1\0"+
    "\7\4\3\0\4\4\2\0\6\4\4\0\15\4\5\0\3\4\1\0"+
    "\7\4\17\0\4\5\26\0\1\35\3\0\5\5\20\0\2\4\23\0"+
    "\1\4\13\0\4\5\6\0\6\5\1\0\1\4\15\0\1\4\40\0"+
    "\22\4\36\0\15\5\4\0\1\5\3\0\6\5\27\0\1\4\4\0"+
    "\1\4\2\0\12\4\1\0\1\4\3\0\5\4\6\0\1\4\1\0"+
    "\1\4\1\0\1\4\1\0\4\4\1\0\3\4\1\0\7\4\3\0"+
    "\3\4\5\0\5\4\26\0\44\4\u0e81\0\3\4\31\0\11\4\6\5"+
    "\1\0\5\4\2\0\5\4\4\0\126\4\2\0\2\5\2\0\3\4"+
    "\1\0\137\4\5\0\50\4\4\0\136\4\21\0\30\4\70\0\20\4"+
    "\u0200\0\u19b6\4\112\0\u51a6\4\132\0\u048d\4\u0773\0\u2ba4\4\u215c\0\u012e\4"+
    "\2\0\73\4\225\0\7\4\14\0\5\4\5\0\1\4\1\5\12\4"+
    "\1\0\15\4\1\0\5\4\1\0\1\4\1\0\2\4\1\0\2\4"+
    "\1\0\154\4\41\0\u016b\4\22\0\100\4\2\0\66\4\50\0\15\4"+
    "\3\0\20\5\20\0\4\5\17\0\2\4\30\0\3\4\31\0\1\4"+
    "\6\0\5\4\1\0\207\4\2\0\1\5\4\0\1\4\13\0\12\5"+
    "\7\0\32\4\4\0\1\4\1\0\32\4\12\0\132\4\3\0\6\4"+
    "\2\0\6\4\2\0\6\4\2\0\3\4\3\0\2\4\3\0\2\4"+
    "\22\0\3\5\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\16\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\24\3"+
    "\1\0\1\17\15\3\1\20\11\3\1\21\1\3\1\22"+
    "\1\23\12\3\1\24\20\3\1\25\1\26\1\27\1\30"+
    "\10\3\1\31\1\32\2\3\1\33\1\3\1\34\3\3"+
    "\1\35\1\36\1\37\6\3\1\40\1\41\2\3\1\42"+
    "\1\43\1\3\1\44\1\3\1\45\2\3\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\47\0\165\0\234\0\303\0\352"+
    "\0\u0111\0\u0138\0\u015f\0\u0186\0\u01ad\0\u01d4\0\u01fb\0\u0222"+
    "\0\u0249\0\u0270\0\47\0\u0297\0\47\0\47\0\47\0\47"+
    "\0\47\0\47\0\47\0\47\0\u02be\0\u02e5\0\u030c\0\u0333"+
    "\0\u035a\0\u0381\0\u03a8\0\u03cf\0\u03f6\0\u041d\0\u0444\0\u046b"+
    "\0\u0492\0\u04b9\0\u04e0\0\u0507\0\u052e\0\u0555\0\u057c\0\u05a3"+
    "\0\u05ca\0\u05f1\0\u0618\0\u063f\0\u0666\0\u068d\0\u06b4\0\u06db"+
    "\0\u0702\0\u0729\0\u0750\0\u0777\0\u079e\0\u07c5\0\u07ec\0\u0813"+
    "\0\165\0\u083a\0\u0861\0\u0888\0\u08af\0\u08d6\0\u08fd\0\u0924"+
    "\0\u094b\0\u0972\0\47\0\u0999\0\165\0\165\0\u09c0\0\u09e7"+
    "\0\u0a0e\0\u0a35\0\u0a5c\0\u0a83\0\u0aaa\0\u0ad1\0\u0af8\0\u0b1f"+
    "\0\165\0\u0b46\0\u0b6d\0\u0b94\0\u0bbb\0\u0be2\0\u0c09\0\u0c30"+
    "\0\u0c57\0\u0c7e\0\u0ca5\0\u0ccc\0\u0cf3\0\u0d1a\0\u0d41\0\u0d68"+
    "\0\u0d8f\0\165\0\165\0\165\0\165\0\u0db6\0\u0ddd\0\u0e04"+
    "\0\u0e2b\0\u0e52\0\u0e79\0\u0ea0\0\u0ec7\0\165\0\165\0\u0eee"+
    "\0\u0f15\0\165\0\u0f3c\0\165\0\u0f63\0\u0f8a\0\u0fb1\0\165"+
    "\0\165\0\165\0\u0fd8\0\u0fff\0\u1026\0\u104d\0\u1074\0\u109b"+
    "\0\165\0\165\0\u10c2\0\u10e9\0\165\0\165\0\u1110\0\165"+
    "\0\u1137\0\165\0\u115e\0\u1185\0\165";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\2\1\6\1\5\1\7"+
    "\1\10\1\11\1\12\1\5\1\13\1\14\2\5\1\15"+
    "\1\5\1\16\1\17\1\20\1\5\1\21\1\22\1\5"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\2\5\51\0\1\4\50\0\26\5"+
    "\13\0\2\5\4\0\3\5\1\36\4\5\1\37\15\5"+
    "\13\0\2\5\4\0\3\5\1\40\22\5\13\0\2\5"+
    "\4\0\26\5\13\0\1\5\1\41\4\0\2\5\1\42"+
    "\23\5\13\0\2\5\4\0\6\5\1\43\17\5\13\0"+
    "\2\5\4\0\13\5\1\44\1\45\11\5\13\0\2\5"+
    "\4\0\10\5\1\46\1\47\1\5\1\50\6\5\1\51"+
    "\3\5\13\0\2\5\4\0\7\5\1\52\16\5\13\0"+
    "\2\5\4\0\13\5\1\53\12\5\13\0\2\5\4\0"+
    "\4\5\1\54\10\5\1\55\10\5\13\0\2\5\4\0"+
    "\3\5\1\56\22\5\13\0\2\5\4\0\3\5\1\57"+
    "\22\5\13\0\2\5\4\0\14\5\1\60\5\5\1\61"+
    "\3\5\13\0\2\5\33\0\1\62\57\0\1\63\6\0"+
    "\3\5\1\64\22\5\13\0\2\5\4\0\11\5\1\65"+
    "\14\5\13\0\2\5\4\0\7\5\1\66\16\5\13\0"+
    "\2\5\4\0\11\5\1\67\14\5\13\0\2\5\4\0"+
    "\12\5\1\70\13\5\13\0\2\5\4\0\11\5\1\71"+
    "\14\5\13\0\2\5\4\0\14\5\1\72\11\5\13\0"+
    "\2\5\4\0\6\5\1\73\17\5\13\0\2\5\4\0"+
    "\7\5\1\74\16\5\13\0\2\5\4\0\6\5\1\75"+
    "\5\5\1\76\11\5\13\0\2\5\4\0\3\5\1\77"+
    "\22\5\13\0\2\5\4\0\24\5\1\100\1\5\13\0"+
    "\2\5\4\0\11\5\1\101\14\5\13\0\2\5\4\0"+
    "\6\5\1\102\17\5\13\0\2\5\4\0\3\5\1\103"+
    "\22\5\13\0\2\5\4\0\7\5\1\104\16\5\13\0"+
    "\2\5\4\0\22\5\1\105\3\5\13\0\2\5\4\0"+
    "\4\5\1\106\10\5\1\107\10\5\13\0\2\5\4\0"+
    "\3\5\1\110\11\5\1\111\10\5\13\0\2\5\4\0"+
    "\2\5\1\112\23\5\13\0\2\5\33\0\1\26\57\0"+
    "\1\113\6\0\4\5\1\114\21\5\13\0\2\5\4\0"+
    "\5\5\1\115\20\5\13\0\2\5\4\0\16\5\1\116"+
    "\7\5\13\0\2\5\4\0\5\5\1\117\20\5\13\0"+
    "\2\5\4\0\11\5\1\120\14\5\13\0\2\5\4\0"+
    "\15\5\1\121\10\5\13\0\2\5\4\0\3\5\1\122"+
    "\22\5\13\0\2\5\4\0\7\5\1\123\16\5\13\0"+
    "\2\5\4\0\17\5\1\124\6\5\13\0\2\5\4\0"+
    "\11\5\1\125\14\5\13\0\2\5\4\0\15\5\1\126"+
    "\10\5\13\0\2\5\4\0\14\5\1\127\11\5\13\0"+
    "\2\5\4\0\5\5\1\130\20\5\13\0\2\5\4\0"+
    "\14\5\1\131\11\5\13\0\2\5\4\0\6\5\1\132"+
    "\17\5\13\0\2\5\4\0\6\5\1\133\17\5\13\0"+
    "\2\5\4\0\2\5\1\134\23\5\13\0\2\5\4\0"+
    "\6\5\1\135\17\5\13\0\2\5\4\0\21\5\1\115"+
    "\4\5\13\0\2\5\4\0\11\5\1\136\14\5\13\0"+
    "\2\5\4\0\23\5\1\137\2\5\13\0\2\5\4\0"+
    "\4\5\1\140\21\5\13\0\2\5\4\0\5\5\1\141"+
    "\20\5\13\0\2\5\4\0\7\5\1\142\16\5\13\0"+
    "\2\5\4\0\14\5\1\143\11\5\13\0\2\5\4\0"+
    "\23\5\1\144\2\5\13\0\2\5\4\0\26\5\13\0"+
    "\1\145\1\5\4\0\12\5\1\146\13\5\13\0\2\5"+
    "\4\0\13\5\1\147\12\5\13\0\2\5\4\0\15\5"+
    "\1\150\10\5\13\0\2\5\4\0\17\5\1\151\6\5"+
    "\13\0\2\5\4\0\11\5\1\152\14\5\13\0\2\5"+
    "\4\0\14\5\1\153\11\5\13\0\2\5\4\0\11\5"+
    "\1\154\14\5\13\0\2\5\4\0\4\5\1\155\21\5"+
    "\13\0\2\5\4\0\4\5\1\156\21\5\13\0\2\5"+
    "\4\0\11\5\1\157\14\5\13\0\2\5\4\0\5\5"+
    "\1\160\20\5\13\0\2\5\4\0\6\5\1\161\17\5"+
    "\13\0\2\5\4\0\15\5\1\162\10\5\13\0\2\5"+
    "\4\0\6\5\1\163\17\5\13\0\2\5\4\0\21\5"+
    "\1\164\4\5\13\0\2\5\4\0\6\5\1\165\17\5"+
    "\13\0\2\5\4\0\5\5\1\166\20\5\13\0\2\5"+
    "\4\0\12\5\1\167\13\5\13\0\2\5\4\0\15\5"+
    "\1\170\10\5\13\0\2\5\4\0\14\5\1\171\11\5"+
    "\13\0\2\5\4\0\17\5\1\172\6\5\13\0\2\5"+
    "\4\0\11\5\1\173\14\5\13\0\2\5\4\0\5\5"+
    "\1\174\20\5\13\0\2\5\4\0\15\5\1\175\10\5"+
    "\13\0\2\5\4\0\17\5\1\176\6\5\13\0\2\5"+
    "\4\0\11\5\1\177\14\5\13\0\2\5\4\0\17\5"+
    "\1\200\6\5\13\0\2\5\4\0\7\5\1\201\16\5"+
    "\13\0\2\5\4\0\12\5\1\202\13\5\13\0\2\5"+
    "\4\0\17\5\1\203\6\5\13\0\2\5\4\0\5\5"+
    "\1\204\20\5\13\0\2\5\4\0\3\5\1\205\22\5"+
    "\13\0\2\5\4\0\20\5\1\206\5\5\13\0\2\5"+
    "\4\0\4\5\1\207\21\5\13\0\2\5\4\0\11\5"+
    "\1\210\14\5\13\0\2\5\4\0\5\5\1\211\20\5"+
    "\13\0\2\5\4\0\11\5\1\212\14\5\13\0\2\5"+
    "\4\0\7\5\1\213\16\5\13\0\2\5\4\0\7\5"+
    "\1\214\16\5\13\0\2\5\4\0\24\5\1\215\1\5"+
    "\13\0\2\5\4\0\5\5\1\216\20\5\13\0\2\5"+
    "\4\0\5\5\1\217\20\5\13\0\2\5\4\0\11\5"+
    "\1\220\14\5\13\0\2\5\4\0\15\5\1\221\10\5"+
    "\13\0\2\5\4\0\21\5\1\222\4\5\13\0\2\5"+
    "\4\0\25\5\1\223\13\0\2\5\4\0\5\5\1\224"+
    "\20\5\13\0\2\5\4\0\21\5\1\225\4\5\13\0"+
    "\2\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4524];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\16\1\1\11\1\1\10\11"+
    "\25\1\1\0\30\1\1\11\112\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public Object value() {
    return yytext();
  }

  public static JavaSignatureLexer create(java.io.InputStream stream) {
    return new JavaSignatureLexer(stream);
  }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public JavaSignatureLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public JavaSignatureLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1746) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 31: 
          { return JavaSignatureParser.EXTENDS;
          }
        case 39: break;
        case 20: 
          { return JavaSignatureParser.CHAR;
          }
        case 40: break;
        case 36: 
          { return JavaSignatureParser.TRANSIENT;
          }
        case 41: break;
        case 21: 
          { return JavaSignatureParser.SHORT;
          }
        case 42: break;
        case 22: 
          { return JavaSignatureParser.SUPER;
          }
        case 43: break;
        case 33: 
          { return JavaSignatureParser.ABSTRACT;
          }
        case 44: break;
        case 12: 
          { return JavaSignatureParser.QUESTION;
          }
        case 45: break;
        case 15: 
          { return JavaSignatureParser.RSHIFT;
          }
        case 46: break;
        case 37: 
          { return JavaSignatureParser.PROTECTED;
          }
        case 47: break;
        case 3: 
          { return JavaSignatureParser.IDENTIFIER;
          }
        case 48: break;
        case 23: 
          { return JavaSignatureParser.FLOAT;
          }
        case 49: break;
        case 14: 
          { return JavaSignatureParser.GT;
          }
        case 50: break;
        case 24: 
          { return JavaSignatureParser.FINAL;
          }
        case 51: break;
        case 29: 
          { return JavaSignatureParser.PUBLIC;
          }
        case 52: break;
        case 8: 
          { return JavaSignatureParser.LPAREN;
          }
        case 53: break;
        case 9: 
          { return JavaSignatureParser.RPAREN;
          }
        case 54: break;
        case 27: 
          { return JavaSignatureParser.STATIC;
          }
        case 55: break;
        case 17: 
          { return JavaSignatureParser.URSHIFT;
          }
        case 56: break;
        case 34: 
          { return JavaSignatureParser.STRICTFP;
          }
        case 57: break;
        case 18: 
          { return JavaSignatureParser.VOID;
          }
        case 58: break;
        case 1: 
          { throw new Error("Invalid character ("+yytext()+")");
          }
        case 59: break;
        case 7: 
          { return JavaSignatureParser.ELLIPSIS;
          }
        case 60: break;
        case 19: 
          { return JavaSignatureParser.LONG;
          }
        case 61: break;
        case 30: 
          { return JavaSignatureParser.BOOLEAN;
          }
        case 62: break;
        case 26: 
          { return JavaSignatureParser.THROWS;
          }
        case 63: break;
        case 25: 
          { return JavaSignatureParser.NATIVE;
          }
        case 64: break;
        case 10: 
          { return JavaSignatureParser.LBRACK;
          }
        case 65: break;
        case 11: 
          { return JavaSignatureParser.RBRACK;
          }
        case 66: break;
        case 13: 
          { return JavaSignatureParser.LT;
          }
        case 67: break;
        case 38: 
          { return JavaSignatureParser.SYNCHRONIZED;
          }
        case 68: break;
        case 5: 
          { return JavaSignatureParser.DOT;
          }
        case 69: break;
        case 35: 
          { return JavaSignatureParser.VOLATILE;
          }
        case 70: break;
        case 28: 
          { return JavaSignatureParser.DOUBLE;
          }
        case 71: break;
        case 6: 
          { return JavaSignatureParser.COMMA;
          }
        case 72: break;
        case 4: 
          { return JavaSignatureParser.AND;
          }
        case 73: break;
        case 32: 
          { return JavaSignatureParser.PRIVATE;
          }
        case 74: break;
        case 16: 
          { return JavaSignatureParser.INT;
          }
        case 75: break;
        case 2: 
          { 
          }
        case 76: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java JavaSignatureLexer <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        JavaSignatureLexer scanner = null;
        try {
          scanner = new JavaSignatureLexer( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}

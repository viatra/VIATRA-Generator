// A Bison parser, made by GNU Bison 3.5.

// Skeleton interface for Bison LALR(1) parsers in C++

// Copyright (C) 2002-2015, 2018-2019 Free Software Foundation, Inc.

// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.

// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

// As a special exception, you may create a larger work that contains
// part or all of the Bison parser skeleton and distribute that work
// under terms of your choice, so long as that work isn't itself a
// parser generator using the skeleton or a modified version thereof
// as a parser skeleton.  Alternatively, if you modify or redistribute
// the parser skeleton itself, you may (at your option) remove this
// special exception, which will cause the skeleton and the resulting
// Bison output files to be licensed under the GNU General Public
// License without this special exception.

// This special exception was added by the Free Software Foundation in
// version 2.2 of Bison.


/**
 ** \file bazel-out/k8-opt/bin/dreal/dr/parser.yy.hh
 ** Define the dreal::parser class.
 */

// C++ LALR(1) parser skeleton written by Akim Demaille.

// Undocumented macros, especially those whose name start with YY_,
// are private implementation details.  Do not rely on them.

#ifndef YY_DREAL_BAZEL_OUT_K8_OPT_BIN_DREAL_DR_PARSER_YY_HH_INCLUDED
# define YY_DREAL_BAZEL_OUT_K8_OPT_BIN_DREAL_DR_PARSER_YY_HH_INCLUDED


# include <cstdlib> // std::abort
# include <iostream>
# include <stdexcept>
# include <string>
# include <vector>

#if defined __cplusplus
# define YY_CPLUSPLUS __cplusplus
#else
# define YY_CPLUSPLUS 199711L
#endif

// Support move semantics when possible.
#if 201103L <= YY_CPLUSPLUS
# define YY_MOVE           std::move
# define YY_MOVE_OR_COPY   move
# define YY_MOVE_REF(Type) Type&&
# define YY_RVREF(Type)    Type&&
# define YY_COPY(Type)     Type
#else
# define YY_MOVE
# define YY_MOVE_OR_COPY   copy
# define YY_MOVE_REF(Type) Type&
# define YY_RVREF(Type)    const Type&
# define YY_COPY(Type)     const Type&
#endif

// Support noexcept when possible.
#if 201103L <= YY_CPLUSPLUS
# define YY_NOEXCEPT noexcept
# define YY_NOTHROW
#else
# define YY_NOEXCEPT
# define YY_NOTHROW throw ()
#endif

// Support constexpr when possible.
#if 201703 <= YY_CPLUSPLUS
# define YY_CONSTEXPR constexpr
#else
# define YY_CONSTEXPR
#endif
# include "location.hh"

#ifndef YY_ASSERT
# include <cassert>
# define YY_ASSERT assert
#endif


#ifndef YY_ATTRIBUTE_PURE
# if defined __GNUC__ && 2 < __GNUC__ + (96 <= __GNUC_MINOR__)
#  define YY_ATTRIBUTE_PURE __attribute__ ((__pure__))
# else
#  define YY_ATTRIBUTE_PURE
# endif
#endif

#ifndef YY_ATTRIBUTE_UNUSED
# if defined __GNUC__ && 2 < __GNUC__ + (7 <= __GNUC_MINOR__)
#  define YY_ATTRIBUTE_UNUSED __attribute__ ((__unused__))
# else
#  define YY_ATTRIBUTE_UNUSED
# endif
#endif

/* Suppress unused-variable warnings by "using" E.  */
#if ! defined lint || defined __GNUC__
# define YYUSE(E) ((void) (E))
#else
# define YYUSE(E) /* empty */
#endif

#if defined __GNUC__ && ! defined __ICC && 407 <= __GNUC__ * 100 + __GNUC_MINOR__
/* Suppress an incorrect diagnostic about yylval being uninitialized.  */
# define YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN                            \
    _Pragma ("GCC diagnostic push")                                     \
    _Pragma ("GCC diagnostic ignored \"-Wuninitialized\"")              \
    _Pragma ("GCC diagnostic ignored \"-Wmaybe-uninitialized\"")
# define YY_IGNORE_MAYBE_UNINITIALIZED_END      \
    _Pragma ("GCC diagnostic pop")
#else
# define YY_INITIAL_VALUE(Value) Value
#endif
#ifndef YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN
# define YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN
# define YY_IGNORE_MAYBE_UNINITIALIZED_END
#endif
#ifndef YY_INITIAL_VALUE
# define YY_INITIAL_VALUE(Value) /* Nothing. */
#endif

#if defined __cplusplus && defined __GNUC__ && ! defined __ICC && 6 <= __GNUC__
# define YY_IGNORE_USELESS_CAST_BEGIN                          \
    _Pragma ("GCC diagnostic push")                            \
    _Pragma ("GCC diagnostic ignored \"-Wuseless-cast\"")
# define YY_IGNORE_USELESS_CAST_END            \
    _Pragma ("GCC diagnostic pop")
#endif
#ifndef YY_IGNORE_USELESS_CAST_BEGIN
# define YY_IGNORE_USELESS_CAST_BEGIN
# define YY_IGNORE_USELESS_CAST_END
#endif

# ifndef YY_CAST
#  ifdef __cplusplus
#   define YY_CAST(Type, Val) static_cast<Type> (Val)
#   define YY_REINTERPRET_CAST(Type, Val) reinterpret_cast<Type> (Val)
#  else
#   define YY_CAST(Type, Val) ((Type) (Val))
#   define YY_REINTERPRET_CAST(Type, Val) ((Type) (Val))
#  endif
# endif
# ifndef YY_NULLPTR
#  if defined __cplusplus
#   if 201103L <= __cplusplus
#    define YY_NULLPTR nullptr
#   else
#    define YY_NULLPTR 0
#   endif
#  else
#   define YY_NULLPTR ((void*)0)
#  endif
# endif

/* Debug traces.  */
#ifndef DREALDEBUG
# if defined YYDEBUG
#if YYDEBUG
#   define DREALDEBUG 1
#  else
#   define DREALDEBUG 0
#  endif
# else /* ! defined YYDEBUG */
#  define DREALDEBUG 1
# endif /* ! defined YYDEBUG */
#endif  /* ! defined DREALDEBUG */

namespace dreal {
#line 188 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.hh"




  /// A Bison parser.
  class DrParser
  {
  public:
#ifndef DREALSTYPE
  /// A buffer to store and retrieve objects.
  ///
  /// Sort of a variant, but does not keep track of the nature
  /// of the stored data, since that knowledge is available
  /// via the current parser state.
  class semantic_type
  {
  public:
    /// Type of *this.
    typedef semantic_type self_type;

    /// Empty construction.
    semantic_type () YY_NOEXCEPT
      : yybuffer_ ()
    {}

    /// Construct and fill.
    template <typename T>
    semantic_type (YY_RVREF (T) t)
    {
      YY_ASSERT (sizeof (T) <= size);
      new (yyas_<T> ()) T (YY_MOVE (t));
    }

    /// Destruction, allowed only if empty.
    ~semantic_type () YY_NOEXCEPT
    {}

# if 201103L <= YY_CPLUSPLUS
    /// Instantiate a \a T in here from \a t.
    template <typename T, typename... U>
    T&
    emplace (U&&... u)
    {
      return *new (yyas_<T> ()) T (std::forward <U>(u)...);
    }
# else
    /// Instantiate an empty \a T in here.
    template <typename T>
    T&
    emplace ()
    {
      return *new (yyas_<T> ()) T ();
    }

    /// Instantiate a \a T in here from \a t.
    template <typename T>
    T&
    emplace (const T& t)
    {
      return *new (yyas_<T> ()) T (t);
    }
# endif

    /// Instantiate an empty \a T in here.
    /// Obsolete, use emplace.
    template <typename T>
    T&
    build ()
    {
      return emplace<T> ();
    }

    /// Instantiate a \a T in here from \a t.
    /// Obsolete, use emplace.
    template <typename T>
    T&
    build (const T& t)
    {
      return emplace<T> (t);
    }

    /// Accessor to a built \a T.
    template <typename T>
    T&
    as () YY_NOEXCEPT
    {
      return *yyas_<T> ();
    }

    /// Const accessor to a built \a T (for %printer).
    template <typename T>
    const T&
    as () const YY_NOEXCEPT
    {
      return *yyas_<T> ();
    }

    /// Swap the content with \a that, of same type.
    ///
    /// Both variants must be built beforehand, because swapping the actual
    /// data requires reading it (with as()), and this is not possible on
    /// unconstructed variants: it would require some dynamic testing, which
    /// should not be the variant's responsibility.
    /// Swapping between built and (possibly) non-built is done with
    /// self_type::move ().
    template <typename T>
    void
    swap (self_type& that) YY_NOEXCEPT
    {
      std::swap (as<T> (), that.as<T> ());
    }

    /// Move the content of \a that to this.
    ///
    /// Destroys \a that.
    template <typename T>
    void
    move (self_type& that)
    {
# if 201103L <= YY_CPLUSPLUS
      emplace<T> (std::move (that.as<T> ()));
# else
      emplace<T> ();
      swap<T> (that);
# endif
      that.destroy<T> ();
    }

# if 201103L <= YY_CPLUSPLUS
    /// Move the content of \a that to this.
    template <typename T>
    void
    move (self_type&& that)
    {
      emplace<T> (std::move (that.as<T> ()));
      that.destroy<T> ();
    }
#endif

    /// Copy the content of \a that to this.
    template <typename T>
    void
    copy (const self_type& that)
    {
      emplace<T> (that.as<T> ());
    }

    /// Destroy the stored \a T.
    template <typename T>
    void
    destroy ()
    {
      as<T> ().~T ();
    }

  private:
    /// Prohibit blind copies.
    self_type& operator= (const self_type&);
    semantic_type (const self_type&);

    /// Accessor to raw memory as \a T.
    template <typename T>
    T*
    yyas_ () YY_NOEXCEPT
    {
      void *yyp = yybuffer_.yyraw;
      return static_cast<T*> (yyp);
     }

    /// Const accessor to raw memory as \a T.
    template <typename T>
    const T*
    yyas_ () const YY_NOEXCEPT
    {
      const void *yyp = yybuffer_.yyraw;
      return static_cast<const T*> (yyp);
     }

    /// An auxiliary type to compute the largest semantic type.
    union union_type
    {
      // expr
      char dummy1[sizeof (Expression)];

      // formula
      char dummy2[sizeof (Formula)];

      // "double"
      char dummy3[sizeof (double)];

      // "identifier"
      char dummy4[sizeof (std::string)];
    };

    /// The size of the largest semantic type.
    enum { size = sizeof (union_type) };

    /// A buffer to store semantic values.
    union
    {
      /// Strongest alignment constraints.
      long double yyalign_me;
      /// A buffer large enough to store any of the semantic values.
      char yyraw[size];
    } yybuffer_;
  };

#else
    typedef DREALSTYPE semantic_type;
#endif
    /// Symbol locations.
    typedef location location_type;

    /// Syntax errors thrown from user actions.
    struct syntax_error : std::runtime_error
    {
      syntax_error (const location_type& l, const std::string& m)
        : std::runtime_error (m)
        , location (l)
      {}

      syntax_error (const syntax_error& s)
        : std::runtime_error (s.what ())
        , location (s.location)
      {}

      ~syntax_error () YY_NOEXCEPT YY_NOTHROW;

      location_type location;
    };

    /// Tokens.
    struct token
    {
      enum yytokentype
      {
        END = 0,
        TK_VAR = 258,
        TK_COST = 259,
        TK_PREC = 260,
        TK_CTR = 261,
        TK_PLUS = 262,
        TK_MINUS = 263,
        TK_TIMES = 264,
        TK_DIV = 265,
        TK_EQ = 266,
        TK_LTE = 267,
        TK_GTE = 268,
        TK_LT = 269,
        TK_GT = 270,
        TK_EXP = 271,
        TK_LOG = 272,
        TK_ABS = 273,
        TK_SIN = 274,
        TK_COS = 275,
        TK_TAN = 276,
        TK_ASIN = 277,
        TK_ACOS = 278,
        TK_ATAN = 279,
        TK_ATAN2 = 280,
        TK_SINH = 281,
        TK_COSH = 282,
        TK_TANH = 283,
        TK_MIN = 284,
        TK_MAX = 285,
        TK_SQRT = 286,
        TK_POW = 287,
        TK_CARET = 288,
        TK_AND = 289,
        TK_OR = 290,
        TK_NOT = 291,
        TK_IMPLIES = 292,
        TK_LB = 293,
        TK_RB = 294,
        TK_COLON = 295,
        TK_COMMA = 296,
        TK_SEMICOLON = 297,
        DOUBLE = 298,
        ID = 299,
        TK_NEQ = 300,
        TK_LEQ = 301,
        TK_GEQ = 302,
        UMINUS = 303
      };
    };

    /// (External) token type, as returned by yylex.
    typedef token::yytokentype token_type;

    /// Symbol type: an internal symbol number.
    typedef int symbol_number_type;

    /// The symbol type number to denote an empty symbol.
    enum { empty_symbol = -2 };

    /// Internal symbol number for tokens (subsumed by symbol_number_type).
    typedef signed char token_number_type;

    /// A complete symbol.
    ///
    /// Expects its Base type to provide access to the symbol type
    /// via type_get ().
    ///
    /// Provide access to semantic value and location.
    template <typename Base>
    struct basic_symbol : Base
    {
      /// Alias to Base.
      typedef Base super_type;

      /// Default constructor.
      basic_symbol ()
        : value ()
        , location ()
      {}

#if 201103L <= YY_CPLUSPLUS
      /// Move constructor.
      basic_symbol (basic_symbol&& that);
#endif

      /// Copy constructor.
      basic_symbol (const basic_symbol& that);

      /// Constructor for valueless symbols, and symbols from each type.
#if 201103L <= YY_CPLUSPLUS
      basic_symbol (typename Base::kind_type t, location_type&& l)
        : Base (t)
        , location (std::move (l))
      {}
#else
      basic_symbol (typename Base::kind_type t, const location_type& l)
        : Base (t)
        , location (l)
      {}
#endif
#if 201103L <= YY_CPLUSPLUS
      basic_symbol (typename Base::kind_type t, Expression&& v, location_type&& l)
        : Base (t)
        , value (std::move (v))
        , location (std::move (l))
      {}
#else
      basic_symbol (typename Base::kind_type t, const Expression& v, const location_type& l)
        : Base (t)
        , value (v)
        , location (l)
      {}
#endif
#if 201103L <= YY_CPLUSPLUS
      basic_symbol (typename Base::kind_type t, Formula&& v, location_type&& l)
        : Base (t)
        , value (std::move (v))
        , location (std::move (l))
      {}
#else
      basic_symbol (typename Base::kind_type t, const Formula& v, const location_type& l)
        : Base (t)
        , value (v)
        , location (l)
      {}
#endif
#if 201103L <= YY_CPLUSPLUS
      basic_symbol (typename Base::kind_type t, double&& v, location_type&& l)
        : Base (t)
        , value (std::move (v))
        , location (std::move (l))
      {}
#else
      basic_symbol (typename Base::kind_type t, const double& v, const location_type& l)
        : Base (t)
        , value (v)
        , location (l)
      {}
#endif
#if 201103L <= YY_CPLUSPLUS
      basic_symbol (typename Base::kind_type t, std::string&& v, location_type&& l)
        : Base (t)
        , value (std::move (v))
        , location (std::move (l))
      {}
#else
      basic_symbol (typename Base::kind_type t, const std::string& v, const location_type& l)
        : Base (t)
        , value (v)
        , location (l)
      {}
#endif

      /// Destroy the symbol.
      ~basic_symbol ()
      {
        clear ();
      }

      /// Destroy contents, and record that is empty.
      void clear ()
      {
        // User destructor.
        symbol_number_type yytype = this->type_get ();
        basic_symbol<Base>& yysym = *this;
        (void) yysym;
        switch (yytype)
        {
       default:
          break;
        }

        // Type destructor.
switch (yytype)
    {
      case 64: // expr
        value.template destroy< Expression > ();
        break;

      case 63: // formula
        value.template destroy< Formula > ();
        break;

      case 43: // "double"
        value.template destroy< double > ();
        break;

      case 44: // "identifier"
        value.template destroy< std::string > ();
        break;

      default:
        break;
    }

        Base::clear ();
      }

      /// Whether empty.
      bool empty () const YY_NOEXCEPT;

      /// Destructive move, \a s is emptied into this.
      void move (basic_symbol& s);

      /// The semantic value.
      semantic_type value;

      /// The location.
      location_type location;

    private:
#if YY_CPLUSPLUS < 201103L
      /// Assignment operator.
      basic_symbol& operator= (const basic_symbol& that);
#endif
    };

    /// Type access provider for token (enum) based symbols.
    struct by_type
    {
      /// Default constructor.
      by_type ();

#if 201103L <= YY_CPLUSPLUS
      /// Move constructor.
      by_type (by_type&& that);
#endif

      /// Copy constructor.
      by_type (const by_type& that);

      /// The symbol type as needed by the constructor.
      typedef token_type kind_type;

      /// Constructor from (external) token numbers.
      by_type (kind_type t);

      /// Record that this symbol is empty.
      void clear ();

      /// Steal the symbol type from \a that.
      void move (by_type& that);

      /// The (internal) type number (corresponding to \a type).
      /// \a empty when empty.
      symbol_number_type type_get () const YY_NOEXCEPT;

      /// The symbol type.
      /// \a empty_symbol when empty.
      /// An int, not token_number_type, to be able to store empty_symbol.
      int type;
    };

    /// "External" symbols: returned by the scanner.
    struct symbol_type : basic_symbol<by_type>
    {
      /// Superclass.
      typedef basic_symbol<by_type> super_type;

      /// Empty symbol.
      symbol_type () {}

      /// Constructor for valueless symbols, and symbols from each type.
#if 201103L <= YY_CPLUSPLUS
      symbol_type (int tok, location_type l)
        : super_type(token_type (tok), std::move (l))
      {
        YY_ASSERT (tok == token::END || tok == token::TK_VAR || tok == token::TK_COST || tok == token::TK_PREC || tok == token::TK_CTR || tok == token::TK_PLUS || tok == token::TK_MINUS || tok == token::TK_TIMES || tok == token::TK_DIV || tok == token::TK_EQ || tok == token::TK_LTE || tok == token::TK_GTE || tok == token::TK_LT || tok == token::TK_GT || tok == token::TK_EXP || tok == token::TK_LOG || tok == token::TK_ABS || tok == token::TK_SIN || tok == token::TK_COS || tok == token::TK_TAN || tok == token::TK_ASIN || tok == token::TK_ACOS || tok == token::TK_ATAN || tok == token::TK_ATAN2 || tok == token::TK_SINH || tok == token::TK_COSH || tok == token::TK_TANH || tok == token::TK_MIN || tok == token::TK_MAX || tok == token::TK_SQRT || tok == token::TK_POW || tok == token::TK_CARET || tok == token::TK_AND || tok == token::TK_OR || tok == token::TK_NOT || tok == token::TK_IMPLIES || tok == token::TK_LB || tok == token::TK_RB || tok == token::TK_COLON || tok == token::TK_COMMA || tok == token::TK_SEMICOLON || tok == token::TK_NEQ || tok == token::TK_LEQ || tok == token::TK_GEQ || tok == token::UMINUS || tok == 40 || tok == 41);
      }
#else
      symbol_type (int tok, const location_type& l)
        : super_type(token_type (tok), l)
      {
        YY_ASSERT (tok == token::END || tok == token::TK_VAR || tok == token::TK_COST || tok == token::TK_PREC || tok == token::TK_CTR || tok == token::TK_PLUS || tok == token::TK_MINUS || tok == token::TK_TIMES || tok == token::TK_DIV || tok == token::TK_EQ || tok == token::TK_LTE || tok == token::TK_GTE || tok == token::TK_LT || tok == token::TK_GT || tok == token::TK_EXP || tok == token::TK_LOG || tok == token::TK_ABS || tok == token::TK_SIN || tok == token::TK_COS || tok == token::TK_TAN || tok == token::TK_ASIN || tok == token::TK_ACOS || tok == token::TK_ATAN || tok == token::TK_ATAN2 || tok == token::TK_SINH || tok == token::TK_COSH || tok == token::TK_TANH || tok == token::TK_MIN || tok == token::TK_MAX || tok == token::TK_SQRT || tok == token::TK_POW || tok == token::TK_CARET || tok == token::TK_AND || tok == token::TK_OR || tok == token::TK_NOT || tok == token::TK_IMPLIES || tok == token::TK_LB || tok == token::TK_RB || tok == token::TK_COLON || tok == token::TK_COMMA || tok == token::TK_SEMICOLON || tok == token::TK_NEQ || tok == token::TK_LEQ || tok == token::TK_GEQ || tok == token::UMINUS || tok == 40 || tok == 41);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      symbol_type (int tok, double v, location_type l)
        : super_type(token_type (tok), std::move (v), std::move (l))
      {
        YY_ASSERT (tok == token::DOUBLE);
      }
#else
      symbol_type (int tok, const double& v, const location_type& l)
        : super_type(token_type (tok), v, l)
      {
        YY_ASSERT (tok == token::DOUBLE);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      symbol_type (int tok, std::string v, location_type l)
        : super_type(token_type (tok), std::move (v), std::move (l))
      {
        YY_ASSERT (tok == token::ID);
      }
#else
      symbol_type (int tok, const std::string& v, const location_type& l)
        : super_type(token_type (tok), v, l)
      {
        YY_ASSERT (tok == token::ID);
      }
#endif
    };

    /// Build a parser object.
    DrParser (class DrDriver& driver_yyarg);
    virtual ~DrParser ();

    /// Parse.  An alias for parse ().
    /// \returns  0 iff parsing succeeded.
    int operator() ();

    /// Parse.
    /// \returns  0 iff parsing succeeded.
    virtual int parse ();

#if DREALDEBUG
    /// The current debugging stream.
    std::ostream& debug_stream () const YY_ATTRIBUTE_PURE;
    /// Set the current debugging stream.
    void set_debug_stream (std::ostream &);

    /// Type for debugging levels.
    typedef int debug_level_type;
    /// The current debugging level.
    debug_level_type debug_level () const YY_ATTRIBUTE_PURE;
    /// Set the current debugging level.
    void set_debug_level (debug_level_type l);
#endif

    /// Report a syntax error.
    /// \param loc    where the syntax error is found.
    /// \param msg    a description of the syntax error.
    virtual void error (const location_type& loc, const std::string& msg);

    /// Report a syntax error.
    void error (const syntax_error& err);

    // Implementation of make_symbol for each symbol type.
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_END (location_type l)
      {
        return symbol_type (token::END, std::move (l));
      }
#else
      static
      symbol_type
      make_END (const location_type& l)
      {
        return symbol_type (token::END, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_VAR (location_type l)
      {
        return symbol_type (token::TK_VAR, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_VAR (const location_type& l)
      {
        return symbol_type (token::TK_VAR, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_COST (location_type l)
      {
        return symbol_type (token::TK_COST, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_COST (const location_type& l)
      {
        return symbol_type (token::TK_COST, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_PREC (location_type l)
      {
        return symbol_type (token::TK_PREC, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_PREC (const location_type& l)
      {
        return symbol_type (token::TK_PREC, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_CTR (location_type l)
      {
        return symbol_type (token::TK_CTR, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_CTR (const location_type& l)
      {
        return symbol_type (token::TK_CTR, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_PLUS (location_type l)
      {
        return symbol_type (token::TK_PLUS, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_PLUS (const location_type& l)
      {
        return symbol_type (token::TK_PLUS, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_MINUS (location_type l)
      {
        return symbol_type (token::TK_MINUS, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_MINUS (const location_type& l)
      {
        return symbol_type (token::TK_MINUS, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_TIMES (location_type l)
      {
        return symbol_type (token::TK_TIMES, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_TIMES (const location_type& l)
      {
        return symbol_type (token::TK_TIMES, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_DIV (location_type l)
      {
        return symbol_type (token::TK_DIV, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_DIV (const location_type& l)
      {
        return symbol_type (token::TK_DIV, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_EQ (location_type l)
      {
        return symbol_type (token::TK_EQ, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_EQ (const location_type& l)
      {
        return symbol_type (token::TK_EQ, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_LTE (location_type l)
      {
        return symbol_type (token::TK_LTE, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_LTE (const location_type& l)
      {
        return symbol_type (token::TK_LTE, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_GTE (location_type l)
      {
        return symbol_type (token::TK_GTE, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_GTE (const location_type& l)
      {
        return symbol_type (token::TK_GTE, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_LT (location_type l)
      {
        return symbol_type (token::TK_LT, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_LT (const location_type& l)
      {
        return symbol_type (token::TK_LT, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_GT (location_type l)
      {
        return symbol_type (token::TK_GT, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_GT (const location_type& l)
      {
        return symbol_type (token::TK_GT, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_EXP (location_type l)
      {
        return symbol_type (token::TK_EXP, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_EXP (const location_type& l)
      {
        return symbol_type (token::TK_EXP, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_LOG (location_type l)
      {
        return symbol_type (token::TK_LOG, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_LOG (const location_type& l)
      {
        return symbol_type (token::TK_LOG, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_ABS (location_type l)
      {
        return symbol_type (token::TK_ABS, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_ABS (const location_type& l)
      {
        return symbol_type (token::TK_ABS, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_SIN (location_type l)
      {
        return symbol_type (token::TK_SIN, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_SIN (const location_type& l)
      {
        return symbol_type (token::TK_SIN, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_COS (location_type l)
      {
        return symbol_type (token::TK_COS, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_COS (const location_type& l)
      {
        return symbol_type (token::TK_COS, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_TAN (location_type l)
      {
        return symbol_type (token::TK_TAN, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_TAN (const location_type& l)
      {
        return symbol_type (token::TK_TAN, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_ASIN (location_type l)
      {
        return symbol_type (token::TK_ASIN, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_ASIN (const location_type& l)
      {
        return symbol_type (token::TK_ASIN, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_ACOS (location_type l)
      {
        return symbol_type (token::TK_ACOS, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_ACOS (const location_type& l)
      {
        return symbol_type (token::TK_ACOS, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_ATAN (location_type l)
      {
        return symbol_type (token::TK_ATAN, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_ATAN (const location_type& l)
      {
        return symbol_type (token::TK_ATAN, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_ATAN2 (location_type l)
      {
        return symbol_type (token::TK_ATAN2, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_ATAN2 (const location_type& l)
      {
        return symbol_type (token::TK_ATAN2, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_SINH (location_type l)
      {
        return symbol_type (token::TK_SINH, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_SINH (const location_type& l)
      {
        return symbol_type (token::TK_SINH, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_COSH (location_type l)
      {
        return symbol_type (token::TK_COSH, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_COSH (const location_type& l)
      {
        return symbol_type (token::TK_COSH, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_TANH (location_type l)
      {
        return symbol_type (token::TK_TANH, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_TANH (const location_type& l)
      {
        return symbol_type (token::TK_TANH, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_MIN (location_type l)
      {
        return symbol_type (token::TK_MIN, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_MIN (const location_type& l)
      {
        return symbol_type (token::TK_MIN, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_MAX (location_type l)
      {
        return symbol_type (token::TK_MAX, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_MAX (const location_type& l)
      {
        return symbol_type (token::TK_MAX, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_SQRT (location_type l)
      {
        return symbol_type (token::TK_SQRT, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_SQRT (const location_type& l)
      {
        return symbol_type (token::TK_SQRT, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_POW (location_type l)
      {
        return symbol_type (token::TK_POW, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_POW (const location_type& l)
      {
        return symbol_type (token::TK_POW, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_CARET (location_type l)
      {
        return symbol_type (token::TK_CARET, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_CARET (const location_type& l)
      {
        return symbol_type (token::TK_CARET, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_AND (location_type l)
      {
        return symbol_type (token::TK_AND, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_AND (const location_type& l)
      {
        return symbol_type (token::TK_AND, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_OR (location_type l)
      {
        return symbol_type (token::TK_OR, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_OR (const location_type& l)
      {
        return symbol_type (token::TK_OR, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_NOT (location_type l)
      {
        return symbol_type (token::TK_NOT, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_NOT (const location_type& l)
      {
        return symbol_type (token::TK_NOT, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_IMPLIES (location_type l)
      {
        return symbol_type (token::TK_IMPLIES, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_IMPLIES (const location_type& l)
      {
        return symbol_type (token::TK_IMPLIES, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_LB (location_type l)
      {
        return symbol_type (token::TK_LB, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_LB (const location_type& l)
      {
        return symbol_type (token::TK_LB, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_RB (location_type l)
      {
        return symbol_type (token::TK_RB, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_RB (const location_type& l)
      {
        return symbol_type (token::TK_RB, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_COLON (location_type l)
      {
        return symbol_type (token::TK_COLON, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_COLON (const location_type& l)
      {
        return symbol_type (token::TK_COLON, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_COMMA (location_type l)
      {
        return symbol_type (token::TK_COMMA, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_COMMA (const location_type& l)
      {
        return symbol_type (token::TK_COMMA, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_SEMICOLON (location_type l)
      {
        return symbol_type (token::TK_SEMICOLON, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_SEMICOLON (const location_type& l)
      {
        return symbol_type (token::TK_SEMICOLON, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_DOUBLE (double v, location_type l)
      {
        return symbol_type (token::DOUBLE, std::move (v), std::move (l));
      }
#else
      static
      symbol_type
      make_DOUBLE (const double& v, const location_type& l)
      {
        return symbol_type (token::DOUBLE, v, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_ID (std::string v, location_type l)
      {
        return symbol_type (token::ID, std::move (v), std::move (l));
      }
#else
      static
      symbol_type
      make_ID (const std::string& v, const location_type& l)
      {
        return symbol_type (token::ID, v, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_NEQ (location_type l)
      {
        return symbol_type (token::TK_NEQ, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_NEQ (const location_type& l)
      {
        return symbol_type (token::TK_NEQ, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_LEQ (location_type l)
      {
        return symbol_type (token::TK_LEQ, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_LEQ (const location_type& l)
      {
        return symbol_type (token::TK_LEQ, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_TK_GEQ (location_type l)
      {
        return symbol_type (token::TK_GEQ, std::move (l));
      }
#else
      static
      symbol_type
      make_TK_GEQ (const location_type& l)
      {
        return symbol_type (token::TK_GEQ, l);
      }
#endif
#if 201103L <= YY_CPLUSPLUS
      static
      symbol_type
      make_UMINUS (location_type l)
      {
        return symbol_type (token::UMINUS, std::move (l));
      }
#else
      static
      symbol_type
      make_UMINUS (const location_type& l)
      {
        return symbol_type (token::UMINUS, l);
      }
#endif


  private:
    /// This class is not copyable.
    DrParser (const DrParser&);
    DrParser& operator= (const DrParser&);

    /// Stored state numbers (used for stacks).
    typedef unsigned char state_type;

    /// Generate an error message.
    /// \param yystate   the state where the error occurred.
    /// \param yyla      the lookahead token.
    virtual std::string yysyntax_error_ (state_type yystate,
                                         const symbol_type& yyla) const;

    /// Compute post-reduction state.
    /// \param yystate   the current state
    /// \param yysym     the nonterminal to push on the stack
    static state_type yy_lr_goto_state_ (state_type yystate, int yysym);

    /// Whether the given \c yypact_ value indicates a defaulted state.
    /// \param yyvalue   the value to check
    static bool yy_pact_value_is_default_ (int yyvalue);

    /// Whether the given \c yytable_ value indicates a syntax error.
    /// \param yyvalue   the value to check
    static bool yy_table_value_is_error_ (int yyvalue);

    static const signed char yypact_ninf_;
    static const signed char yytable_ninf_;

    /// Convert a scanner token number \a t to a symbol number.
    /// In theory \a t should be a token_type, but character literals
    /// are valid, yet not members of the token_type enum.
    static token_number_type yytranslate_ (int t);

    // Tables.
    // YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
    // STATE-NUM.
    static const short yypact_[];

    // YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
    // Performed when YYTABLE does not specify something else to do.  Zero
    // means the default is an error.
    static const signed char yydefact_[];

    // YYPGOTO[NTERM-NUM].
    static const short yypgoto_[];

    // YYDEFGOTO[NTERM-NUM].
    static const signed char yydefgoto_[];

    // YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
    // positive, shift that token.  If negative, reduce the rule whose
    // number is the opposite.  If YYTABLE_NINF, syntax error.
    static const unsigned char yytable_[];

    static const short yycheck_[];

    // YYSTOS[STATE-NUM] -- The (internal number of the) accessing
    // symbol of state STATE-NUM.
    static const signed char yystos_[];

    // YYR1[YYN] -- Symbol number of symbol that rule YYN derives.
    static const signed char yyr1_[];

    // YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.
    static const signed char yyr2_[];


    /// Convert the symbol name \a n to a form suitable for a diagnostic.
    static std::string yytnamerr_ (const char *n);


    /// For a symbol, its name in clear.
    static const char* const yytname_[];
#if DREALDEBUG
    // YYRLINE[YYN] -- Source line where rule number YYN was defined.
    static const unsigned char yyrline_[];
    /// Report on the debug stream that the rule \a r is going to be reduced.
    virtual void yy_reduce_print_ (int r);
    /// Print the state stack on the debug stream.
    virtual void yystack_print_ ();

    /// Debugging level.
    int yydebug_;
    /// Debug stream.
    std::ostream* yycdebug_;

    /// \brief Display a symbol type, value and location.
    /// \param yyo    The output stream.
    /// \param yysym  The symbol.
    template <typename Base>
    void yy_print_ (std::ostream& yyo, const basic_symbol<Base>& yysym) const;
#endif

    /// \brief Reclaim the memory associated to a symbol.
    /// \param yymsg     Why this token is reclaimed.
    ///                  If null, print nothing.
    /// \param yysym     The symbol.
    template <typename Base>
    void yy_destroy_ (const char* yymsg, basic_symbol<Base>& yysym) const;

  private:
    /// Type access provider for state based symbols.
    struct by_state
    {
      /// Default constructor.
      by_state () YY_NOEXCEPT;

      /// The symbol type as needed by the constructor.
      typedef state_type kind_type;

      /// Constructor.
      by_state (kind_type s) YY_NOEXCEPT;

      /// Copy constructor.
      by_state (const by_state& that) YY_NOEXCEPT;

      /// Record that this symbol is empty.
      void clear () YY_NOEXCEPT;

      /// Steal the symbol type from \a that.
      void move (by_state& that);

      /// The (internal) type number (corresponding to \a state).
      /// \a empty_symbol when empty.
      symbol_number_type type_get () const YY_NOEXCEPT;

      /// The state number used to denote an empty symbol.
      /// We use the initial state, as it does not have a value.
      enum { empty_state = 0 };

      /// The state.
      /// \a empty when empty.
      state_type state;
    };

    /// "Internal" symbol: element of the stack.
    struct stack_symbol_type : basic_symbol<by_state>
    {
      /// Superclass.
      typedef basic_symbol<by_state> super_type;
      /// Construct an empty symbol.
      stack_symbol_type ();
      /// Move or copy construction.
      stack_symbol_type (YY_RVREF (stack_symbol_type) that);
      /// Steal the contents from \a sym to build this.
      stack_symbol_type (state_type s, YY_MOVE_REF (symbol_type) sym);
#if YY_CPLUSPLUS < 201103L
      /// Assignment, needed by push_back by some old implementations.
      /// Moves the contents of that.
      stack_symbol_type& operator= (stack_symbol_type& that);

      /// Assignment, needed by push_back by other implementations.
      /// Needed by some other old implementations.
      stack_symbol_type& operator= (const stack_symbol_type& that);
#endif
    };

    /// A stack with random access from its top.
    template <typename T, typename S = std::vector<T> >
    class stack
    {
    public:
      // Hide our reversed order.
      typedef typename S::reverse_iterator iterator;
      typedef typename S::const_reverse_iterator const_iterator;
      typedef typename S::size_type size_type;
      typedef typename std::ptrdiff_t index_type;

      stack (size_type n = 200)
        : seq_ (n)
      {}

      /// Random access.
      ///
      /// Index 0 returns the topmost element.
      const T&
      operator[] (index_type i) const
      {
        return seq_[size_type (size () - 1 - i)];
      }

      /// Random access.
      ///
      /// Index 0 returns the topmost element.
      T&
      operator[] (index_type i)
      {
        return seq_[size_type (size () - 1 - i)];
      }

      /// Steal the contents of \a t.
      ///
      /// Close to move-semantics.
      void
      push (YY_MOVE_REF (T) t)
      {
        seq_.push_back (T ());
        operator[] (0).move (t);
      }

      /// Pop elements from the stack.
      void
      pop (std::ptrdiff_t n = 1) YY_NOEXCEPT
      {
        for (; 0 < n; --n)
          seq_.pop_back ();
      }

      /// Pop all elements from the stack.
      void
      clear () YY_NOEXCEPT
      {
        seq_.clear ();
      }

      /// Number of elements on the stack.
      index_type
      size () const YY_NOEXCEPT
      {
        return index_type (seq_.size ());
      }

      std::ptrdiff_t
      ssize () const YY_NOEXCEPT
      {
        return std::ptrdiff_t (size ());
      }

      /// Iterator on top of the stack (going downwards).
      const_iterator
      begin () const YY_NOEXCEPT
      {
        return seq_.rbegin ();
      }

      /// Bottom of the stack.
      const_iterator
      end () const YY_NOEXCEPT
      {
        return seq_.rend ();
      }

      /// Present a slice of the top of a stack.
      class slice
      {
      public:
        slice (const stack& stack, index_type range)
          : stack_ (stack)
          , range_ (range)
        {}

        const T&
        operator[] (index_type i) const
        {
          return stack_[range_ - i];
        }

      private:
        const stack& stack_;
        index_type range_;
      };

    private:
      stack (const stack&);
      stack& operator= (const stack&);
      /// The wrapped container.
      S seq_;
    };


    /// Stack type.
    typedef stack<stack_symbol_type> stack_type;

    /// The stack.
    stack_type yystack_;

    /// Push a new state on the stack.
    /// \param m    a debug message to display
    ///             if null, no trace is output.
    /// \param sym  the symbol
    /// \warning the contents of \a s.value is stolen.
    void yypush_ (const char* m, YY_MOVE_REF (stack_symbol_type) sym);

    /// Push a new look ahead token on the state on the stack.
    /// \param m    a debug message to display
    ///             if null, no trace is output.
    /// \param s    the state
    /// \param sym  the symbol (for its value and location).
    /// \warning the contents of \a sym.value is stolen.
    void yypush_ (const char* m, state_type s, YY_MOVE_REF (symbol_type) sym);

    /// Pop \a n symbols from the stack.
    void yypop_ (int n = 1);

    /// Some specific tokens.
    static const token_number_type yy_error_token_ = 1;
    static const token_number_type yy_undef_token_ = 2;

    /// Constants.
    enum
    {
      yyeof_ = 0,
      yylast_ = 455,     ///< Last index in yytable_.
      yynnts_ = 14,  ///< Number of nonterminal symbols.
      yyfinal_ = 5, ///< Termination state number.
      yyntokens_ = 51  ///< Number of tokens.
    };


    // User arguments.
    class DrDriver& driver;
  };


} // dreal
#line 1788 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.hh"





#endif // !YY_DREAL_BAZEL_OUT_K8_OPT_BIN_DREAL_DR_PARSER_YY_HH_INCLUDED

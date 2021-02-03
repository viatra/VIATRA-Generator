// A Bison parser, made by GNU Bison 3.5.

// Skeleton implementation for Bison LALR(1) parsers in C++

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

// Undocumented macros, especially those whose name start with YY_,
// are private implementation details.  Do not rely on them.


// Take the name prefix into account.
#define yylex   dreallex

// First part of user prologue.
#line 1 "dreal/smt2/parser.yy"


#include <cmath>
#include <cstdint>
#include <iostream>
#include <stdexcept>
#include <string>
#include <tuple>
#include <utility>

#include "dreal/smt2/logic.h"
#include "dreal/smt2/sort.h"
#include "dreal/smt2/term.h"
#include "dreal/symbolic/symbolic.h"
#include "dreal/util/math.h"

#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wold-style-cast"
#pragma GCC diagnostic ignored "-Wdeprecated"

#ifdef __clang__
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wunknown-warning-option"
#pragma clang diagnostic ignored "-Wdtor-name"
#endif

/* void yyerror(SmtPrsr parser, const char *); */
#define YYMAXDEPTH 1024 * 1024
#line 108 "dreal/smt2/parser.yy"


#include "dreal/smt2/driver.h"
#include "dreal/smt2/scanner.h"

/* this "connects" the bison parser in the driver to the flex scanner class
 * object. it defines the yylex() function call to pull the next token from the
 * current lexer object of the driver context. */
#undef yylex
#define yylex driver.scanner->lex


#line 84 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"


#include "parser.yy.hh"




#ifndef YY_
# if defined YYENABLE_NLS && YYENABLE_NLS
#  if ENABLE_NLS
#   include <libintl.h> // FIXME: INFRINGES ON USER NAME SPACE.
#   define YY_(msgid) dgettext ("bison-runtime", msgid)
#  endif
# endif
# ifndef YY_
#  define YY_(msgid) msgid
# endif
#endif

// Whether we are compiled with exception support.
#ifndef YY_EXCEPTIONS
# if defined __GNUC__ && !defined __EXCEPTIONS
#  define YY_EXCEPTIONS 0
# else
#  define YY_EXCEPTIONS 1
# endif
#endif

#define YYRHSLOC(Rhs, K) ((Rhs)[K].location)
/* YYLLOC_DEFAULT -- Set CURRENT to span from RHS[1] to RHS[N].
   If N is 0, then set CURRENT to the empty location which ends
   the previous symbol: RHS[0] (always defined).  */

# ifndef YYLLOC_DEFAULT
#  define YYLLOC_DEFAULT(Current, Rhs, N)                               \
    do                                                                  \
      if (N)                                                            \
        {                                                               \
          (Current).begin  = YYRHSLOC (Rhs, 1).begin;                   \
          (Current).end    = YYRHSLOC (Rhs, N).end;                     \
        }                                                               \
      else                                                              \
        {                                                               \
          (Current).begin = (Current).end = YYRHSLOC (Rhs, 0).end;      \
        }                                                               \
    while (false)
# endif


// Enable debugging if requested.
#if DREALDEBUG

// A pseudo ostream that takes yydebug_ into account.
# define YYCDEBUG if (yydebug_) (*yycdebug_)

# define YY_SYMBOL_PRINT(Title, Symbol)         \
  do {                                          \
    if (yydebug_)                               \
    {                                           \
      *yycdebug_ << Title << ' ';               \
      yy_print_ (*yycdebug_, Symbol);           \
      *yycdebug_ << '\n';                       \
    }                                           \
  } while (false)

# define YY_REDUCE_PRINT(Rule)          \
  do {                                  \
    if (yydebug_)                       \
      yy_reduce_print_ (Rule);          \
  } while (false)

# define YY_STACK_PRINT()               \
  do {                                  \
    if (yydebug_)                       \
      yystack_print_ ();                \
  } while (false)

#else // !DREALDEBUG

# define YYCDEBUG if (false) std::cerr
# define YY_SYMBOL_PRINT(Title, Symbol)  YYUSE (Symbol)
# define YY_REDUCE_PRINT(Rule)           static_cast<void> (0)
# define YY_STACK_PRINT()                static_cast<void> (0)

#endif // !DREALDEBUG

#define yyerrok         (yyerrstatus_ = 0)
#define yyclearin       (yyla.clear ())

#define YYACCEPT        goto yyacceptlab
#define YYABORT         goto yyabortlab
#define YYERROR         goto yyerrorlab
#define YYRECOVERING()  (!!yyerrstatus_)

namespace dreal {
#line 180 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"


  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  std::string
  Smt2Parser::yytnamerr_ (const char *yystr)
  {
    if (*yystr == '"')
      {
        std::string yyr;
        char const *yyp = yystr;

        for (;;)
          switch (*++yyp)
            {
            case '\'':
            case ',':
              goto do_not_strip_quotes;

            case '\\':
              if (*++yyp != '\\')
                goto do_not_strip_quotes;
              else
                goto append;

            append:
            default:
              yyr += *yyp;
              break;

            case '"':
              return yyr;
            }
      do_not_strip_quotes: ;
      }

    return yystr;
  }


  /// Build a parser object.
  Smt2Parser::Smt2Parser (class Smt2Driver& driver_yyarg)
#if DREALDEBUG
    : yydebug_ (false),
      yycdebug_ (&std::cerr),
#else
    :
#endif
      driver (driver_yyarg)
  {}

  Smt2Parser::~Smt2Parser ()
  {}

  Smt2Parser::syntax_error::~syntax_error () YY_NOEXCEPT YY_NOTHROW
  {}

  /*---------------.
  | Symbol types.  |
  `---------------*/

  // basic_symbol.
#if 201103L <= YY_CPLUSPLUS
  template <typename Base>
  Smt2Parser::basic_symbol<Base>::basic_symbol (basic_symbol&& that)
    : Base (std::move (that))
    , value ()
    , location (std::move (that.location))
  {
    switch (this->type_get ())
    {
      case 109: // term
        value.move< Term > (std::move (that.value));
        break;

      case 113: // name_sort
        value.move< Variable > (std::move (that.value));
        break;

      case 79: // "hexfloat"
        value.move< double > (std::move (that.value));
        break;

      case 117: // sort
        value.move< dreal::Sort > (std::move (that.value));
        break;

      case 80: // "int64"
        value.move< std::int64_t > (std::move (that.value));
        break;

      case 115: // variable_sort_list
        value.move< std::pair<Variables, Formula> > (std::move (that.value));
        break;

      case 119: // var_binding
        value.move< std::pair<std::string, Term> > (std::move (that.value));
        break;

      case 78: // "double"
      case 81: // "symbol"
      case 82: // "keyword"
      case 83: // "string"
        value.move< std::string > (std::move (that.value));
        break;

      case 116: // variable_sort
        value.move< std::tuple<Variable, double, double> > (std::move (that.value));
        break;

      case 108: // term_list
        value.move< std::vector<Term> > (std::move (that.value));
        break;

      case 114: // name_sort_list
        value.move< std::vector<Variable> > (std::move (that.value));
        break;

      case 118: // var_binding_list
        value.move< std::vector<std::pair<std::string, Term>> > (std::move (that.value));
        break;

      default:
        break;
    }

  }
#endif

  template <typename Base>
  Smt2Parser::basic_symbol<Base>::basic_symbol (const basic_symbol& that)
    : Base (that)
    , value ()
    , location (that.location)
  {
    switch (this->type_get ())
    {
      case 109: // term
        value.copy< Term > (YY_MOVE (that.value));
        break;

      case 113: // name_sort
        value.copy< Variable > (YY_MOVE (that.value));
        break;

      case 79: // "hexfloat"
        value.copy< double > (YY_MOVE (that.value));
        break;

      case 117: // sort
        value.copy< dreal::Sort > (YY_MOVE (that.value));
        break;

      case 80: // "int64"
        value.copy< std::int64_t > (YY_MOVE (that.value));
        break;

      case 115: // variable_sort_list
        value.copy< std::pair<Variables, Formula> > (YY_MOVE (that.value));
        break;

      case 119: // var_binding
        value.copy< std::pair<std::string, Term> > (YY_MOVE (that.value));
        break;

      case 78: // "double"
      case 81: // "symbol"
      case 82: // "keyword"
      case 83: // "string"
        value.copy< std::string > (YY_MOVE (that.value));
        break;

      case 116: // variable_sort
        value.copy< std::tuple<Variable, double, double> > (YY_MOVE (that.value));
        break;

      case 108: // term_list
        value.copy< std::vector<Term> > (YY_MOVE (that.value));
        break;

      case 114: // name_sort_list
        value.copy< std::vector<Variable> > (YY_MOVE (that.value));
        break;

      case 118: // var_binding_list
        value.copy< std::vector<std::pair<std::string, Term>> > (YY_MOVE (that.value));
        break;

      default:
        break;
    }

  }



  template <typename Base>
  bool
  Smt2Parser::basic_symbol<Base>::empty () const YY_NOEXCEPT
  {
    return Base::type_get () == empty_symbol;
  }

  template <typename Base>
  void
  Smt2Parser::basic_symbol<Base>::move (basic_symbol& s)
  {
    super_type::move (s);
    switch (this->type_get ())
    {
      case 109: // term
        value.move< Term > (YY_MOVE (s.value));
        break;

      case 113: // name_sort
        value.move< Variable > (YY_MOVE (s.value));
        break;

      case 79: // "hexfloat"
        value.move< double > (YY_MOVE (s.value));
        break;

      case 117: // sort
        value.move< dreal::Sort > (YY_MOVE (s.value));
        break;

      case 80: // "int64"
        value.move< std::int64_t > (YY_MOVE (s.value));
        break;

      case 115: // variable_sort_list
        value.move< std::pair<Variables, Formula> > (YY_MOVE (s.value));
        break;

      case 119: // var_binding
        value.move< std::pair<std::string, Term> > (YY_MOVE (s.value));
        break;

      case 78: // "double"
      case 81: // "symbol"
      case 82: // "keyword"
      case 83: // "string"
        value.move< std::string > (YY_MOVE (s.value));
        break;

      case 116: // variable_sort
        value.move< std::tuple<Variable, double, double> > (YY_MOVE (s.value));
        break;

      case 108: // term_list
        value.move< std::vector<Term> > (YY_MOVE (s.value));
        break;

      case 114: // name_sort_list
        value.move< std::vector<Variable> > (YY_MOVE (s.value));
        break;

      case 118: // var_binding_list
        value.move< std::vector<std::pair<std::string, Term>> > (YY_MOVE (s.value));
        break;

      default:
        break;
    }

    location = YY_MOVE (s.location);
  }

  // by_type.
  Smt2Parser::by_type::by_type ()
    : type (empty_symbol)
  {}

#if 201103L <= YY_CPLUSPLUS
  Smt2Parser::by_type::by_type (by_type&& that)
    : type (that.type)
  {
    that.clear ();
  }
#endif

  Smt2Parser::by_type::by_type (const by_type& that)
    : type (that.type)
  {}

  Smt2Parser::by_type::by_type (token_type t)
    : type (yytranslate_ (t))
  {}

  void
  Smt2Parser::by_type::clear ()
  {
    type = empty_symbol;
  }

  void
  Smt2Parser::by_type::move (by_type& that)
  {
    type = that.type;
    that.clear ();
  }

  int
  Smt2Parser::by_type::type_get () const YY_NOEXCEPT
  {
    return type;
  }


  // by_state.
  Smt2Parser::by_state::by_state () YY_NOEXCEPT
    : state (empty_state)
  {}

  Smt2Parser::by_state::by_state (const by_state& that) YY_NOEXCEPT
    : state (that.state)
  {}

  void
  Smt2Parser::by_state::clear () YY_NOEXCEPT
  {
    state = empty_state;
  }

  void
  Smt2Parser::by_state::move (by_state& that)
  {
    state = that.state;
    that.clear ();
  }

  Smt2Parser::by_state::by_state (state_type s) YY_NOEXCEPT
    : state (s)
  {}

  Smt2Parser::symbol_number_type
  Smt2Parser::by_state::type_get () const YY_NOEXCEPT
  {
    if (state == empty_state)
      return empty_symbol;
    else
      return yystos_[state];
  }

  Smt2Parser::stack_symbol_type::stack_symbol_type ()
  {}

  Smt2Parser::stack_symbol_type::stack_symbol_type (YY_RVREF (stack_symbol_type) that)
    : super_type (YY_MOVE (that.state), YY_MOVE (that.location))
  {
    switch (that.type_get ())
    {
      case 109: // term
        value.YY_MOVE_OR_COPY< Term > (YY_MOVE (that.value));
        break;

      case 113: // name_sort
        value.YY_MOVE_OR_COPY< Variable > (YY_MOVE (that.value));
        break;

      case 79: // "hexfloat"
        value.YY_MOVE_OR_COPY< double > (YY_MOVE (that.value));
        break;

      case 117: // sort
        value.YY_MOVE_OR_COPY< dreal::Sort > (YY_MOVE (that.value));
        break;

      case 80: // "int64"
        value.YY_MOVE_OR_COPY< std::int64_t > (YY_MOVE (that.value));
        break;

      case 115: // variable_sort_list
        value.YY_MOVE_OR_COPY< std::pair<Variables, Formula> > (YY_MOVE (that.value));
        break;

      case 119: // var_binding
        value.YY_MOVE_OR_COPY< std::pair<std::string, Term> > (YY_MOVE (that.value));
        break;

      case 78: // "double"
      case 81: // "symbol"
      case 82: // "keyword"
      case 83: // "string"
        value.YY_MOVE_OR_COPY< std::string > (YY_MOVE (that.value));
        break;

      case 116: // variable_sort
        value.YY_MOVE_OR_COPY< std::tuple<Variable, double, double> > (YY_MOVE (that.value));
        break;

      case 108: // term_list
        value.YY_MOVE_OR_COPY< std::vector<Term> > (YY_MOVE (that.value));
        break;

      case 114: // name_sort_list
        value.YY_MOVE_OR_COPY< std::vector<Variable> > (YY_MOVE (that.value));
        break;

      case 118: // var_binding_list
        value.YY_MOVE_OR_COPY< std::vector<std::pair<std::string, Term>> > (YY_MOVE (that.value));
        break;

      default:
        break;
    }

#if 201103L <= YY_CPLUSPLUS
    // that is emptied.
    that.state = empty_state;
#endif
  }

  Smt2Parser::stack_symbol_type::stack_symbol_type (state_type s, YY_MOVE_REF (symbol_type) that)
    : super_type (s, YY_MOVE (that.location))
  {
    switch (that.type_get ())
    {
      case 109: // term
        value.move< Term > (YY_MOVE (that.value));
        break;

      case 113: // name_sort
        value.move< Variable > (YY_MOVE (that.value));
        break;

      case 79: // "hexfloat"
        value.move< double > (YY_MOVE (that.value));
        break;

      case 117: // sort
        value.move< dreal::Sort > (YY_MOVE (that.value));
        break;

      case 80: // "int64"
        value.move< std::int64_t > (YY_MOVE (that.value));
        break;

      case 115: // variable_sort_list
        value.move< std::pair<Variables, Formula> > (YY_MOVE (that.value));
        break;

      case 119: // var_binding
        value.move< std::pair<std::string, Term> > (YY_MOVE (that.value));
        break;

      case 78: // "double"
      case 81: // "symbol"
      case 82: // "keyword"
      case 83: // "string"
        value.move< std::string > (YY_MOVE (that.value));
        break;

      case 116: // variable_sort
        value.move< std::tuple<Variable, double, double> > (YY_MOVE (that.value));
        break;

      case 108: // term_list
        value.move< std::vector<Term> > (YY_MOVE (that.value));
        break;

      case 114: // name_sort_list
        value.move< std::vector<Variable> > (YY_MOVE (that.value));
        break;

      case 118: // var_binding_list
        value.move< std::vector<std::pair<std::string, Term>> > (YY_MOVE (that.value));
        break;

      default:
        break;
    }

    // that is emptied.
    that.type = empty_symbol;
  }

#if YY_CPLUSPLUS < 201103L
  Smt2Parser::stack_symbol_type&
  Smt2Parser::stack_symbol_type::operator= (const stack_symbol_type& that)
  {
    state = that.state;
    switch (that.type_get ())
    {
      case 109: // term
        value.copy< Term > (that.value);
        break;

      case 113: // name_sort
        value.copy< Variable > (that.value);
        break;

      case 79: // "hexfloat"
        value.copy< double > (that.value);
        break;

      case 117: // sort
        value.copy< dreal::Sort > (that.value);
        break;

      case 80: // "int64"
        value.copy< std::int64_t > (that.value);
        break;

      case 115: // variable_sort_list
        value.copy< std::pair<Variables, Formula> > (that.value);
        break;

      case 119: // var_binding
        value.copy< std::pair<std::string, Term> > (that.value);
        break;

      case 78: // "double"
      case 81: // "symbol"
      case 82: // "keyword"
      case 83: // "string"
        value.copy< std::string > (that.value);
        break;

      case 116: // variable_sort
        value.copy< std::tuple<Variable, double, double> > (that.value);
        break;

      case 108: // term_list
        value.copy< std::vector<Term> > (that.value);
        break;

      case 114: // name_sort_list
        value.copy< std::vector<Variable> > (that.value);
        break;

      case 118: // var_binding_list
        value.copy< std::vector<std::pair<std::string, Term>> > (that.value);
        break;

      default:
        break;
    }

    location = that.location;
    return *this;
  }

  Smt2Parser::stack_symbol_type&
  Smt2Parser::stack_symbol_type::operator= (stack_symbol_type& that)
  {
    state = that.state;
    switch (that.type_get ())
    {
      case 109: // term
        value.move< Term > (that.value);
        break;

      case 113: // name_sort
        value.move< Variable > (that.value);
        break;

      case 79: // "hexfloat"
        value.move< double > (that.value);
        break;

      case 117: // sort
        value.move< dreal::Sort > (that.value);
        break;

      case 80: // "int64"
        value.move< std::int64_t > (that.value);
        break;

      case 115: // variable_sort_list
        value.move< std::pair<Variables, Formula> > (that.value);
        break;

      case 119: // var_binding
        value.move< std::pair<std::string, Term> > (that.value);
        break;

      case 78: // "double"
      case 81: // "symbol"
      case 82: // "keyword"
      case 83: // "string"
        value.move< std::string > (that.value);
        break;

      case 116: // variable_sort
        value.move< std::tuple<Variable, double, double> > (that.value);
        break;

      case 108: // term_list
        value.move< std::vector<Term> > (that.value);
        break;

      case 114: // name_sort_list
        value.move< std::vector<Variable> > (that.value);
        break;

      case 118: // var_binding_list
        value.move< std::vector<std::pair<std::string, Term>> > (that.value);
        break;

      default:
        break;
    }

    location = that.location;
    // that is emptied.
    that.state = empty_state;
    return *this;
  }
#endif

  template <typename Base>
  void
  Smt2Parser::yy_destroy_ (const char* yymsg, basic_symbol<Base>& yysym) const
  {
    if (yymsg)
      YY_SYMBOL_PRINT (yymsg, yysym);
  }

#if DREALDEBUG
  template <typename Base>
  void
  Smt2Parser::yy_print_ (std::ostream& yyo,
                                     const basic_symbol<Base>& yysym) const
  {
    std::ostream& yyoutput = yyo;
    YYUSE (yyoutput);
    symbol_number_type yytype = yysym.type_get ();
#if defined __GNUC__ && ! defined __clang__ && ! defined __ICC && __GNUC__ * 100 + __GNUC_MINOR__ <= 408
    // Avoid a (spurious) G++ 4.8 warning about "array subscript is
    // below array bounds".
    if (yysym.empty ())
      std::abort ();
#endif
    yyo << (yytype < yyntokens_ ? "token" : "nterm")
        << ' ' << yytname_[yytype] << " ("
        << yysym.location << ": ";
    YYUSE (yytype);
    yyo << ')';
  }
#endif

  void
  Smt2Parser::yypush_ (const char* m, YY_MOVE_REF (stack_symbol_type) sym)
  {
    if (m)
      YY_SYMBOL_PRINT (m, sym);
    yystack_.push (YY_MOVE (sym));
  }

  void
  Smt2Parser::yypush_ (const char* m, state_type s, YY_MOVE_REF (symbol_type) sym)
  {
#if 201103L <= YY_CPLUSPLUS
    yypush_ (m, stack_symbol_type (s, std::move (sym)));
#else
    stack_symbol_type ss (s, sym);
    yypush_ (m, ss);
#endif
  }

  void
  Smt2Parser::yypop_ (int n)
  {
    yystack_.pop (n);
  }

#if DREALDEBUG
  std::ostream&
  Smt2Parser::debug_stream () const
  {
    return *yycdebug_;
  }

  void
  Smt2Parser::set_debug_stream (std::ostream& o)
  {
    yycdebug_ = &o;
  }


  Smt2Parser::debug_level_type
  Smt2Parser::debug_level () const
  {
    return yydebug_;
  }

  void
  Smt2Parser::set_debug_level (debug_level_type l)
  {
    yydebug_ = l;
  }
#endif // DREALDEBUG

  Smt2Parser::state_type
  Smt2Parser::yy_lr_goto_state_ (state_type yystate, int yysym)
  {
    int yyr = yypgoto_[yysym - yyntokens_] + yystate;
    if (0 <= yyr && yyr <= yylast_ && yycheck_[yyr] == yystate)
      return yytable_[yyr];
    else
      return yydefgoto_[yysym - yyntokens_];
  }

  bool
  Smt2Parser::yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  bool
  Smt2Parser::yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  int
  Smt2Parser::operator() ()
  {
    return parse ();
  }

  int
  Smt2Parser::parse ()
  {
    int yyn;
    /// Length of the RHS of the rule being reduced.
    int yylen = 0;

    // Error handling.
    int yynerrs_ = 0;
    int yyerrstatus_ = 0;

    /// The lookahead symbol.
    symbol_type yyla;

    /// The locations where the error started and ended.
    stack_symbol_type yyerror_range[3];

    /// The return value of parse ().
    int yyresult;

#if YY_EXCEPTIONS
    try
#endif // YY_EXCEPTIONS
      {
    YYCDEBUG << "Starting parse\n";


    // User initialization code.
#line 55 "dreal/smt2/parser.yy"
{
    // initialize the initial location object
    yyla.location.begin.filename = yyla.location.end.filename = &driver.mutable_streamname();
}

#line 940 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"


    /* Initialize the stack.  The initial state will be set in
       yynewstate, since the latter expects the semantical and the
       location values to have been already stored, initialize these
       stacks with a primary value.  */
    yystack_.clear ();
    yypush_ (YY_NULLPTR, 0, YY_MOVE (yyla));

  /*-----------------------------------------------.
  | yynewstate -- push a new symbol on the stack.  |
  `-----------------------------------------------*/
  yynewstate:
    YYCDEBUG << "Entering state " << int (yystack_[0].state) << '\n';

    // Accept?
    if (yystack_[0].state == yyfinal_)
      YYACCEPT;

    goto yybackup;


  /*-----------.
  | yybackup.  |
  `-----------*/
  yybackup:
    // Try to take a decision without lookahead.
    yyn = yypact_[yystack_[0].state];
    if (yy_pact_value_is_default_ (yyn))
      goto yydefault;

    // Read a lookahead token.
    if (yyla.empty ())
      {
        YYCDEBUG << "Reading a token: ";
#if YY_EXCEPTIONS
        try
#endif // YY_EXCEPTIONS
          {
            yyla.type = yytranslate_ (yylex (&yyla.value, &yyla.location));
          }
#if YY_EXCEPTIONS
        catch (const syntax_error& yyexc)
          {
            YYCDEBUG << "Caught exception: " << yyexc.what() << '\n';
            error (yyexc);
            goto yyerrlab1;
          }
#endif // YY_EXCEPTIONS
      }
    YY_SYMBOL_PRINT ("Next token is", yyla);

    /* If the proper action on seeing token YYLA.TYPE is to reduce or
       to detect an error, take that action.  */
    yyn += yyla.type_get ();
    if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yyla.type_get ())
      {
        goto yydefault;
      }

    // Reduce or error.
    yyn = yytable_[yyn];
    if (yyn <= 0)
      {
        if (yy_table_value_is_error_ (yyn))
          goto yyerrlab;
        yyn = -yyn;
        goto yyreduce;
      }

    // Count tokens shifted since error; after three, turn off error status.
    if (yyerrstatus_)
      --yyerrstatus_;

    // Shift the lookahead token.
    yypush_ ("Shifting", static_cast<state_type> (yyn), YY_MOVE (yyla));
    goto yynewstate;


  /*-----------------------------------------------------------.
  | yydefault -- do the default action for the current state.  |
  `-----------------------------------------------------------*/
  yydefault:
    yyn = yydefact_[yystack_[0].state];
    if (yyn == 0)
      goto yyerrlab;
    goto yyreduce;


  /*-----------------------------.
  | yyreduce -- do a reduction.  |
  `-----------------------------*/
  yyreduce:
    yylen = yyr2_[yyn];
    {
      stack_symbol_type yylhs;
      yylhs.state = yy_lr_goto_state_ (yystack_[yylen].state, yyr1_[yyn]);
      /* Variants are always initialized to an empty instance of the
         correct type. The default '$$ = $1' action is NOT applied
         when using variants.  */
      switch (yyr1_[yyn])
    {
      case 109: // term
        yylhs.value.emplace< Term > ();
        break;

      case 113: // name_sort
        yylhs.value.emplace< Variable > ();
        break;

      case 79: // "hexfloat"
        yylhs.value.emplace< double > ();
        break;

      case 117: // sort
        yylhs.value.emplace< dreal::Sort > ();
        break;

      case 80: // "int64"
        yylhs.value.emplace< std::int64_t > ();
        break;

      case 115: // variable_sort_list
        yylhs.value.emplace< std::pair<Variables, Formula> > ();
        break;

      case 119: // var_binding
        yylhs.value.emplace< std::pair<std::string, Term> > ();
        break;

      case 78: // "double"
      case 81: // "symbol"
      case 82: // "keyword"
      case 83: // "string"
        yylhs.value.emplace< std::string > ();
        break;

      case 116: // variable_sort
        yylhs.value.emplace< std::tuple<Variable, double, double> > ();
        break;

      case 108: // term_list
        yylhs.value.emplace< std::vector<Term> > ();
        break;

      case 114: // name_sort_list
        yylhs.value.emplace< std::vector<Variable> > ();
        break;

      case 118: // var_binding_list
        yylhs.value.emplace< std::vector<std::pair<std::string, Term>> > ();
        break;

      default:
        break;
    }


      // Default location.
      {
        stack_type::slice range (yystack_, yylen);
        YYLLOC_DEFAULT (yylhs.location, range, yylen);
        yyerror_range[1].location = yylhs.location;
      }

      // Perform the reduction.
      YY_REDUCE_PRINT (yyn);
#if YY_EXCEPTIONS
      try
#endif // YY_EXCEPTIONS
        {
          switch (yyn)
            {
  case 20:
#line 148 "dreal/smt2/parser.yy"
                                      {
                    driver.mutable_context().Assert(yystack_[1].value.as < Term > ().formula());
                }
#line 1119 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 21:
#line 153 "dreal/smt2/parser.yy"
                                    {
                    driver.CheckSat();
                }
#line 1127 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 22:
#line 158 "dreal/smt2/parser.yy"
                                                           {
                    driver.DeclareVariable(yystack_[4].value.as < std::string > (), yystack_[1].value.as < dreal::Sort > ());
                }
#line 1135 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 23:
#line 162 "dreal/smt2/parser.yy"
                                                                                 {
                    driver.DeclareVariable(yystack_[9].value.as < std::string > (), yystack_[6].value.as < dreal::Sort > (), yystack_[4].value.as < Term > (), yystack_[2].value.as < Term > ());
                }
#line 1143 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 24:
#line 166 "dreal/smt2/parser.yy"
                                                     {
                    driver.DeclareVariable(yystack_[2].value.as < std::string > (), yystack_[1].value.as < dreal::Sort > ());
                }
#line 1151 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 25:
#line 170 "dreal/smt2/parser.yy"
                                                                           {
                    driver.DeclareVariable(yystack_[7].value.as < std::string > (), yystack_[6].value.as < dreal::Sort > (), yystack_[4].value.as < Term > (), yystack_[2].value.as < Term > ());
                }
#line 1159 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 26:
#line 176 "dreal/smt2/parser.yy"
                                                                                                     {
                    if (yystack_[5].value.as < std::vector<Variable> > ().empty()) {
                        // No parameters - treat as variable, just like declare-fun.
                        const Variable v{driver.DeclareVariable(yystack_[8].value.as < std::string > (), yystack_[3].value.as < dreal::Sort > ())};
                        if (yystack_[2].value.as < Term > ().type() == Term::Type::FORMULA) {
                            driver.mutable_context().Assert(v == yystack_[2].value.as < Term > ().formula());
                        } else {
                            driver.mutable_context().Assert(v == yystack_[2].value.as < Term > ().expression());
                        }
                    } else {
                        driver.DefineFun(yystack_[8].value.as < std::string > (), yystack_[5].value.as < std::vector<Variable> > (), yystack_[3].value.as < dreal::Sort > (), yystack_[2].value.as < Term > ());
                    }
                }
#line 1177 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 27:
#line 191 "dreal/smt2/parser.yy"
                               {
                    driver.mutable_context().Exit();
		    YYACCEPT;
                }
#line 1186 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 28:
#line 198 "dreal/smt2/parser.yy"
                                    {
                    driver.GetModel();
                }
#line 1194 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 29:
#line 204 "dreal/smt2/parser.yy"
                                                       {
                    driver.GetValue(yystack_[2].value.as < std::vector<Term> > ());
                }
#line 1202 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 30:
#line 209 "dreal/smt2/parser.yy"
                                           {
                      driver.mutable_context().Maximize(yystack_[1].value.as < Term > ().expression());
                }
#line 1210 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 31:
#line 214 "dreal/smt2/parser.yy"
                                           {
                      driver.mutable_context().Minimize(yystack_[1].value.as < Term > ().expression());
                }
#line 1218 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 32:
#line 220 "dreal/smt2/parser.yy"
                                                   {
                    driver
                        .mutable_context()
                        .SetInfo(yystack_[2].value.as < std::string > (), yystack_[1].value.as < std::string > ());
                }
#line 1228 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 33:
#line 225 "dreal/smt2/parser.yy"
                                                   {
                    driver
                        .mutable_context()
                        .SetInfo(yystack_[2].value.as < std::string > (), yystack_[1].value.as < std::string > ());
                }
#line 1238 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 34:
#line 230 "dreal/smt2/parser.yy"
                                                   {
                    driver
                        .mutable_context()
                        .SetInfo(yystack_[2].value.as < std::string > (), std::stod(yystack_[1].value.as < std::string > ()));
                }
#line 1248 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 35:
#line 237 "dreal/smt2/parser.yy"
                                            {
                    driver
                        .mutable_context()
                        .SetLogic(dreal::parse_logic(yystack_[1].value.as < std::string > ()));
                }
#line 1258 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 36:
#line 244 "dreal/smt2/parser.yy"
                                                     {
                    driver
                        .mutable_context()
                        .SetOption(yystack_[2].value.as < std::string > (), yystack_[1].value.as < std::string > ());
                }
#line 1268 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 37:
#line 249 "dreal/smt2/parser.yy"
                                                    {
                    driver
                        .mutable_context()
                        .SetOption(yystack_[2].value.as < std::string > (), std::stod(yystack_[1].value.as < std::string > ()));
                }
#line 1278 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 38:
#line 254 "dreal/smt2/parser.yy"
                                                     {
                    driver
                        .mutable_context()
                        .SetOption(yystack_[2].value.as < std::string > (), "true");
                }
#line 1288 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 39:
#line 259 "dreal/smt2/parser.yy"
                                                      {
                    driver
                        .mutable_context()
                        .SetOption(yystack_[2].value.as < std::string > (), "false");
                }
#line 1298 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 40:
#line 267 "dreal/smt2/parser.yy"
                                              {
                    driver
                        .GetOption(yystack_[1].value.as < std::string > ());
                }
#line 1307 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 41:
#line 274 "dreal/smt2/parser.yy"
                                    {
                    driver.mutable_context().Push(convert_int64_to_int(yystack_[1].value.as < std::int64_t > ()));
                }
#line 1315 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 42:
#line 279 "dreal/smt2/parser.yy"
                                   {
                    driver.mutable_context().Pop(convert_int64_to_int(yystack_[1].value.as < std::int64_t > ()));
                }
#line 1323 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 43:
#line 284 "dreal/smt2/parser.yy"
                     { yylhs.value.as < std::vector<Term> > () = std::vector<Term>(1, yystack_[0].value.as < Term > ()); }
#line 1329 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 44:
#line 285 "dreal/smt2/parser.yy"
                               { yystack_[1].value.as < std::vector<Term> > ().push_back(yystack_[0].value.as < Term > ()); yylhs.value.as < std::vector<Term> > () = yystack_[1].value.as < std::vector<Term> > ();  }
#line 1335 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 45:
#line 288 "dreal/smt2/parser.yy"
                        { yylhs.value.as < Term > () = Formula::True(); }
#line 1341 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 46:
#line 289 "dreal/smt2/parser.yy"
                         { yylhs.value.as < Term > () = Formula::False(); }
#line 1347 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 47:
#line 290 "dreal/smt2/parser.yy"
                                       {
            const Term& t1 = yystack_[2].value.as < Term > ();
            const Term& t2 = yystack_[1].value.as < Term > ();
            if (t1.type() == Term::Type::EXPRESSION &&
                t2.type() == Term::Type::EXPRESSION) {
                yylhs.value.as < Term > () = t1.expression() == t2.expression();
            } else if (t1.type() == Term::Type::FORMULA &&
                       t2.type() == Term::Type::FORMULA) {
                //    (f1 = f2)
                // -> (f1 ⇔ f2)
                // -> (f1 ∧ f2) ∨ (¬f1 ∧ ¬f2)
                yylhs.value.as < Term > () = t1.formula() == t2.formula();
            } else {
                std::cerr << yystack_[4].location << " : Type mismatch in `t1 == t2`:" << std::endl
                          << "    t1 = " << t1 << std::endl
                          << "    t2 = " << t2 << std::endl;
                YYABORT;
            }
        }
#line 1371 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 48:
#line 309 "dreal/smt2/parser.yy"
                                        { yylhs.value.as < Term > () = yystack_[2].value.as < Term > ().expression() <  yystack_[1].value.as < Term > ().expression(); }
#line 1377 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 49:
#line 310 "dreal/smt2/parser.yy"
                                        { yylhs.value.as < Term > () = yystack_[2].value.as < Term > ().expression() <= yystack_[1].value.as < Term > ().expression(); }
#line 1383 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 50:
#line 311 "dreal/smt2/parser.yy"
                                        { yylhs.value.as < Term > () = yystack_[2].value.as < Term > ().expression() >  yystack_[1].value.as < Term > ().expression(); }
#line 1389 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 51:
#line 312 "dreal/smt2/parser.yy"
                                        { yylhs.value.as < Term > () = yystack_[2].value.as < Term > ().expression() >= yystack_[1].value.as < Term > ().expression(); }
#line 1395 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 52:
#line 313 "dreal/smt2/parser.yy"
                                        {
            Formula f = Formula::True();
            for (const Term& t : yystack_[1].value.as < std::vector<Term> > ()) {
                f = f && t.formula();
            }
            yylhs.value.as < Term > () = f;
        }
#line 1407 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 53:
#line 320 "dreal/smt2/parser.yy"
                                       {
            Formula f = Formula::False();
            for (const Term& t : yystack_[1].value.as < std::vector<Term> > ()) {
                f = f || t.formula();
            }
            yylhs.value.as < Term > () = f;
        }
#line 1419 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 54:
#line 327 "dreal/smt2/parser.yy"
                                        {
            Formula f = Formula::False();
            for (const Term& t : yystack_[1].value.as < std::vector<Term> > ()) {
                f = (f && !t.formula()) || (!f && t.formula());
            }
            yylhs.value.as < Term > () = f;
        }
#line 1431 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 55:
#line 334 "dreal/smt2/parser.yy"
                                   {
            yylhs.value.as < Term > () = !(yystack_[1].value.as < Term > ().formula());
        }
#line 1439 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 56:
#line 337 "dreal/smt2/parser.yy"
                                           {
            yylhs.value.as < Term > () = !(yystack_[2].value.as < Term > ().formula()) || yystack_[1].value.as < Term > ().formula();
        }
#line 1447 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 57:
#line 340 "dreal/smt2/parser.yy"
                                             {
            const Formula& cond = yystack_[3].value.as < Term > ().formula();
            const Term& then_term = yystack_[2].value.as < Term > ();
            const Term& else_term = yystack_[1].value.as < Term > ();
            if (then_term.type() == Term::Type::EXPRESSION &&
                else_term.type() == Term::Type::EXPRESSION) {
                const Expression& e1 = then_term.expression();
                const Expression& e2 = else_term.expression();
                yylhs.value.as < Term > () = if_then_else(cond, e1, e2);
            } else if (then_term.type() == Term::Type::FORMULA &&
                       else_term.type() == Term::Type::FORMULA) {
                //    if(cond) then f1 else f2
                // -> (cond => f1) ∧ (¬cond => f2)
                // -> (¬cond ∨ f1) ∧ (cond ∨ f2)
                const Formula& f1 = then_term.formula();
                const Formula& f2 = else_term.formula();
                yylhs.value.as < Term > () = (!cond || f1) && (cond || f2);
            } else {
                std::cerr << yystack_[5].location << " : Type mismatch in `if (c) then t1 else t2`:" << std::endl
                          << "    t1 = " << then_term << std::endl
                          << "    t2 = " << else_term << std::endl;
                YYABORT;
            }
        }
#line 1476 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 58:
#line 364 "dreal/smt2/parser.yy"
                                                                                         {
	    const Variables& vars = yystack_[4].value.as < std::pair<Variables, Formula> > ().first;
            const Formula& domain = yystack_[4].value.as < std::pair<Variables, Formula> > ().second;
	    const Formula body = Smt2Driver::EliminateBooleanVariables(vars, yystack_[2].value.as < Term > ().formula());
	    const Variables quantified_variables = intersect(vars, body.GetFreeVariables());
	    if (quantified_variables.empty()) {
	        yylhs.value.as < Term > () = body;
	    } else {
                yylhs.value.as < Term > () = forall(quantified_variables, imply(domain, body));
	    }
        }
#line 1492 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 59:
#line 375 "dreal/smt2/parser.yy"
                                                                            {
            yylhs.value.as < Term > () = yystack_[2].value.as < Term > ();
        }
#line 1500 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 60:
#line 378 "dreal/smt2/parser.yy"
                       {
            const Box::Interval i{StringToInterval(yystack_[0].value.as < std::string > ())};
            const double parsed{std::stod(yystack_[0].value.as < std::string > ())};
            if (i.diam() == 0) {
                // point => floating-point constant expression.
                yylhs.value.as < Term > () = i.mid();
            } else {
                // interval => real constant expression.
                yylhs.value.as < Term > () = real_constant(i.lb(), i.ub(), i.lb() == parsed);
            }
        }
#line 1516 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 61:
#line 389 "dreal/smt2/parser.yy"
                         { yylhs.value.as < Term > () = yystack_[0].value.as < double > (); }
#line 1522 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 62:
#line 390 "dreal/smt2/parser.yy"
                    { yylhs.value.as < Term > () = convert_int64_to_double(yystack_[0].value.as < std::int64_t > ()); }
#line 1528 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 63:
#line 391 "dreal/smt2/parser.yy"
                       {
            try {
                const Variable& var = driver.lookup_variable(yystack_[0].value.as < std::string > ());
                if (var.get_type() == Variable::Type::BOOLEAN) {
                    yylhs.value.as < Term > () = Formula(var);
                } else {
                    yylhs.value.as < Term > () = Expression(var);
                }
            } catch (std::runtime_error& e) {
                std::cerr << yystack_[0].location << " : " << e.what() << std::endl;
                YYABORT;
            }
        }
#line 1546 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 64:
#line 404 "dreal/smt2/parser.yy"
                                     {
            yylhs.value.as < Term > () = yystack_[1].value.as < Term > ();
        }
#line 1554 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 65:
#line 407 "dreal/smt2/parser.yy"
                                               {
            for (const Term& term : yystack_[1].value.as < std::vector<Term> > ()) {
                yystack_[2].value.as < Term > ().mutable_expression() += term.expression();
            }
            yylhs.value.as < Term > () = yystack_[2].value.as < Term > ();
        }
#line 1565 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 66:
#line 413 "dreal/smt2/parser.yy"
                                      {
            yylhs.value.as < Term > () = - yystack_[1].value.as < Term > ().expression();
        }
#line 1573 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 67:
#line 416 "dreal/smt2/parser.yy"
                                                {
            for (const Term& term : yystack_[1].value.as < std::vector<Term> > ()) {
                yystack_[2].value.as < Term > ().mutable_expression() -= term.expression();
            }
            yylhs.value.as < Term > () = yystack_[2].value.as < Term > ();
        }
#line 1584 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 68:
#line 422 "dreal/smt2/parser.yy"
                                                {
            for (const Term& term : yystack_[1].value.as < std::vector<Term> > ()) {
                yystack_[2].value.as < Term > ().mutable_expression() *= term.expression();
            }
            yylhs.value.as < Term > () = yystack_[2].value.as < Term > ();
        }
#line 1595 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 69:
#line 428 "dreal/smt2/parser.yy"
                                              {
            for (const Term& term : yystack_[1].value.as < std::vector<Term> > ()) {
                yystack_[2].value.as < Term > ().mutable_expression() /= term.expression();
            }
            yylhs.value.as < Term > () = yystack_[2].value.as < Term > ();
        }
#line 1606 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 70:
#line 434 "dreal/smt2/parser.yy"
                                   {
            yylhs.value.as < Term > () = exp(yystack_[1].value.as < Term > ().expression());
        }
#line 1614 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 71:
#line 437 "dreal/smt2/parser.yy"
                                   {
            yylhs.value.as < Term > () = log(yystack_[1].value.as < Term > ().expression());
        }
#line 1622 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 72:
#line 440 "dreal/smt2/parser.yy"
                                   {
            yylhs.value.as < Term > () = abs(yystack_[1].value.as < Term > ().expression());
        }
#line 1630 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 73:
#line 443 "dreal/smt2/parser.yy"
                                   {
            yylhs.value.as < Term > () = sin(yystack_[1].value.as < Term > ().expression());
            }
#line 1638 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 74:
#line 446 "dreal/smt2/parser.yy"
                                   {
            yylhs.value.as < Term > () = cos(yystack_[1].value.as < Term > ().expression());
            }
#line 1646 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 75:
#line 449 "dreal/smt2/parser.yy"
                                   {
            yylhs.value.as < Term > () = tan(yystack_[1].value.as < Term > ().expression());
            }
#line 1654 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 76:
#line 452 "dreal/smt2/parser.yy"
                                    {
            yylhs.value.as < Term > () = asin(yystack_[1].value.as < Term > ().expression());
            }
#line 1662 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 77:
#line 455 "dreal/smt2/parser.yy"
                                    {
            yylhs.value.as < Term > () = acos(yystack_[1].value.as < Term > ().expression());
            }
#line 1670 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 78:
#line 458 "dreal/smt2/parser.yy"
                                    {
            yylhs.value.as < Term > () = atan(yystack_[1].value.as < Term > ().expression());
            }
#line 1678 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 79:
#line 461 "dreal/smt2/parser.yy"
                                          {
            yylhs.value.as < Term > () = atan2(yystack_[2].value.as < Term > ().expression(), yystack_[1].value.as < Term > ().expression());
            }
#line 1686 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 80:
#line 464 "dreal/smt2/parser.yy"
                                    {
            yylhs.value.as < Term > () = sinh(yystack_[1].value.as < Term > ().expression());
            }
#line 1694 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 81:
#line 467 "dreal/smt2/parser.yy"
                                    {
            yylhs.value.as < Term > () = cosh(yystack_[1].value.as < Term > ().expression());
            }
#line 1702 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 82:
#line 470 "dreal/smt2/parser.yy"
                                    {
            yylhs.value.as < Term > () = tanh(yystack_[1].value.as < Term > ().expression());
            }
#line 1710 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 83:
#line 473 "dreal/smt2/parser.yy"
                                        {
            yylhs.value.as < Term > () = min(yystack_[2].value.as < Term > ().expression(), yystack_[1].value.as < Term > ().expression());
            }
#line 1718 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 84:
#line 476 "dreal/smt2/parser.yy"
                                        {
            yylhs.value.as < Term > () = max(yystack_[2].value.as < Term > ().expression(), yystack_[1].value.as < Term > ().expression());
            }
#line 1726 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 85:
#line 479 "dreal/smt2/parser.yy"
                                    {
            yylhs.value.as < Term > () = sqrt(yystack_[1].value.as < Term > ().expression());
            }
#line 1734 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 86:
#line 482 "dreal/smt2/parser.yy"
                                        {
            yylhs.value.as < Term > () = pow(yystack_[2].value.as < Term > ().expression(), yystack_[1].value.as < Term > ().expression());
            }
#line 1742 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 87:
#line 485 "dreal/smt2/parser.yy"
                                        {
            yylhs.value.as < Term > () = driver.LookupFunction(yystack_[2].value.as < std::string > (), yystack_[1].value.as < std::vector<Term> > ());
            }
#line 1750 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 88:
#line 490 "dreal/smt2/parser.yy"
                                           {
            // Locals must be bound simultaneously.
            for (auto& binding : yystack_[1].value.as < std::vector<std::pair<std::string, Term>> > ()) {
                const std::string& name{ binding.first };
                const Term& term{ binding.second };
                const bool is_formula = term.type() == Term::Type::FORMULA;
                const Sort sort = is_formula ? Sort::Bool : Sort::Real;
                const Variable v{ driver.DeclareLocalVariable(name, sort) };
                if (is_formula) {
                    const Formula fv{v};
                    const Formula& ft{ term.formula() };
                    driver.mutable_context().Assert((fv && ft) || (!fv && !ft));
                } else {
                    driver.mutable_context().Assert(Expression{v} == term.expression());
                }
            }
        }
#line 1772 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 89:
#line 509 "dreal/smt2/parser.yy"
                   {
            driver.PushScope();
        }
#line 1780 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 90:
#line 514 "dreal/smt2/parser.yy"
                  {
            driver.PopScope();
        }
#line 1788 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 91:
#line 519 "dreal/smt2/parser.yy"
                               {
            yylhs.value.as < Variable > () = Variable{driver.DeclareLocalVariable(yystack_[2].value.as < std::string > (), yystack_[1].value.as < dreal::Sort > ())};
        }
#line 1796 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 92:
#line 524 "dreal/smt2/parser.yy"
                                 { yylhs.value.as < std::vector<Variable> > () = std::vector<Variable>{}; }
#line 1802 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 93:
#line 525 "dreal/smt2/parser.yy"
                                         {
            const Variable& v = yystack_[1].value.as < Variable > ();
	    yystack_[0].value.as < std::vector<Variable> > ().push_back(v);
	    yylhs.value.as < std::vector<Variable> > () = yystack_[0].value.as < std::vector<Variable> > ();
        }
#line 1812 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 94:
#line 533 "dreal/smt2/parser.yy"
                                     { yylhs.value.as < std::pair<Variables, Formula> > () = std::pair<Variables, Formula>(Variables{}, Formula::True()); }
#line 1818 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 95:
#line 534 "dreal/smt2/parser.yy"
                                                 {
            const Variable& v = std::get<0>(yystack_[1].value.as < std::tuple<Variable, double, double> > ());
            const double lb = std::get<1>(yystack_[1].value.as < std::tuple<Variable, double, double> > ());
            const double ub = std::get<2>(yystack_[1].value.as < std::tuple<Variable, double, double> > ());
            yystack_[0].value.as < std::pair<Variables, Formula> > ().first.insert(v);
            if (std::isfinite(lb)) {
                yystack_[0].value.as < std::pair<Variables, Formula> > ().second = yystack_[0].value.as < std::pair<Variables, Formula> > ().second && (lb <= v);
            }
            if (std::isfinite(ub)) {
                yystack_[0].value.as < std::pair<Variables, Formula> > ().second = yystack_[0].value.as < std::pair<Variables, Formula> > ().second && (v <= ub);
            }
            yylhs.value.as < std::pair<Variables, Formula> > () = yystack_[0].value.as < std::pair<Variables, Formula> > ();
        }
#line 1836 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 96:
#line 549 "dreal/smt2/parser.yy"
                                   {
            const Variable v = driver.RegisterVariable(yystack_[2].value.as < std::string > (), yystack_[1].value.as < dreal::Sort > ());
            const double inf = std::numeric_limits<double>::infinity();
            yylhs.value.as < std::tuple<Variable, double, double> > () = std::tuple<Variable, double, double>(v, -inf, inf);
        }
#line 1846 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 97:
#line 554 "dreal/smt2/parser.yy"
                                                          {
            const Variable v = driver.RegisterVariable(yystack_[7].value.as < std::string > (), yystack_[6].value.as < dreal::Sort > ());
            const double lb = yystack_[4].value.as < Term > ().expression().Evaluate();
            const double ub = yystack_[2].value.as < Term > ().expression().Evaluate();
            yylhs.value.as < std::tuple<Variable, double, double> > () = std::tuple<Variable, double, double>(v, lb, ub);
        }
#line 1857 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 98:
#line 562 "dreal/smt2/parser.yy"
                       { yylhs.value.as < dreal::Sort > () = ParseSort(yystack_[0].value.as < std::string > ()); }
#line 1863 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 99:
#line 565 "dreal/smt2/parser.yy"
                                   {
            yylhs.value.as < std::vector<std::pair<std::string, Term>> > () = std::vector<std::pair<std::string, Term>>{};
        }
#line 1871 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 100:
#line 568 "dreal/smt2/parser.yy"
                                       {
            yystack_[0].value.as < std::vector<std::pair<std::string, Term>> > ().push_back(yystack_[1].value.as < std::pair<std::string, Term> > ());
            yylhs.value.as < std::vector<std::pair<std::string, Term>> > () = yystack_[0].value.as < std::vector<std::pair<std::string, Term>> > ();
        }
#line 1880 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;

  case 101:
#line 574 "dreal/smt2/parser.yy"
                                 {
            yylhs.value.as < std::pair<std::string, Term> > () = std::pair<std::string, Term>(yystack_[2].value.as < std::string > (), yystack_[1].value.as < Term > ());
        }
#line 1888 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"
    break;


#line 1892 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"

            default:
              break;
            }
        }
#if YY_EXCEPTIONS
      catch (const syntax_error& yyexc)
        {
          YYCDEBUG << "Caught exception: " << yyexc.what() << '\n';
          error (yyexc);
          YYERROR;
        }
#endif // YY_EXCEPTIONS
      YY_SYMBOL_PRINT ("-> $$ =", yylhs);
      yypop_ (yylen);
      yylen = 0;
      YY_STACK_PRINT ();

      // Shift the result of the reduction.
      yypush_ (YY_NULLPTR, YY_MOVE (yylhs));
    }
    goto yynewstate;


  /*--------------------------------------.
  | yyerrlab -- here on detecting error.  |
  `--------------------------------------*/
  yyerrlab:
    // If not already recovering from an error, report this error.
    if (!yyerrstatus_)
      {
        ++yynerrs_;
        error (yyla.location, yysyntax_error_ (yystack_[0].state, yyla));
      }


    yyerror_range[1].location = yyla.location;
    if (yyerrstatus_ == 3)
      {
        /* If just tried and failed to reuse lookahead token after an
           error, discard it.  */

        // Return failure if at end of input.
        if (yyla.type_get () == yyeof_)
          YYABORT;
        else if (!yyla.empty ())
          {
            yy_destroy_ ("Error: discarding", yyla);
            yyla.clear ();
          }
      }

    // Else will try to reuse lookahead token after shifting the error token.
    goto yyerrlab1;


  /*---------------------------------------------------.
  | yyerrorlab -- error raised explicitly by YYERROR.  |
  `---------------------------------------------------*/
  yyerrorlab:
    /* Pacify compilers when the user code never invokes YYERROR and
       the label yyerrorlab therefore never appears in user code.  */
    if (false)
      YYERROR;

    /* Do not reclaim the symbols of the rule whose action triggered
       this YYERROR.  */
    yypop_ (yylen);
    yylen = 0;
    goto yyerrlab1;


  /*-------------------------------------------------------------.
  | yyerrlab1 -- common code for both syntax error and YYERROR.  |
  `-------------------------------------------------------------*/
  yyerrlab1:
    yyerrstatus_ = 3;   // Each real token shifted decrements this.
    {
      stack_symbol_type error_token;
      for (;;)
        {
          yyn = yypact_[yystack_[0].state];
          if (!yy_pact_value_is_default_ (yyn))
            {
              yyn += yy_error_token_;
              if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yy_error_token_)
                {
                  yyn = yytable_[yyn];
                  if (0 < yyn)
                    break;
                }
            }

          // Pop the current state because it cannot handle the error token.
          if (yystack_.size () == 1)
            YYABORT;

          yyerror_range[1].location = yystack_[0].location;
          yy_destroy_ ("Error: popping", yystack_[0]);
          yypop_ ();
          YY_STACK_PRINT ();
        }

      yyerror_range[2].location = yyla.location;
      YYLLOC_DEFAULT (error_token.location, yyerror_range, 2);

      // Shift the error token.
      error_token.state = static_cast<state_type> (yyn);
      yypush_ ("Shifting", YY_MOVE (error_token));
    }
    goto yynewstate;


  /*-------------------------------------.
  | yyacceptlab -- YYACCEPT comes here.  |
  `-------------------------------------*/
  yyacceptlab:
    yyresult = 0;
    goto yyreturn;


  /*-----------------------------------.
  | yyabortlab -- YYABORT comes here.  |
  `-----------------------------------*/
  yyabortlab:
    yyresult = 1;
    goto yyreturn;


  /*-----------------------------------------------------.
  | yyreturn -- parsing is finished, return the result.  |
  `-----------------------------------------------------*/
  yyreturn:
    if (!yyla.empty ())
      yy_destroy_ ("Cleanup: discarding lookahead", yyla);

    /* Do not reclaim the symbols of the rule whose action triggered
       this YYABORT or YYACCEPT.  */
    yypop_ (yylen);
    while (1 < yystack_.size ())
      {
        yy_destroy_ ("Cleanup: popping", yystack_[0]);
        yypop_ ();
      }

    return yyresult;
  }
#if YY_EXCEPTIONS
    catch (...)
      {
        YYCDEBUG << "Exception caught: cleaning lookahead and stack\n";
        // Do not try to display the values of the reclaimed symbols,
        // as their printers might throw an exception.
        if (!yyla.empty ())
          yy_destroy_ (YY_NULLPTR, yyla);

        while (1 < yystack_.size ())
          {
            yy_destroy_ (YY_NULLPTR, yystack_[0]);
            yypop_ ();
          }
        throw;
      }
#endif // YY_EXCEPTIONS
  }

  void
  Smt2Parser::error (const syntax_error& yyexc)
  {
    error (yyexc.location, yyexc.what ());
  }

  // Generate an error message.
  std::string
  Smt2Parser::yysyntax_error_ (state_type yystate, const symbol_type& yyla) const
  {
    // Number of reported tokens (one for the "unexpected", one per
    // "expected").
    std::ptrdiff_t yycount = 0;
    // Its maximum.
    enum { YYERROR_VERBOSE_ARGS_MAXIMUM = 5 };
    // Arguments of yyformat.
    char const *yyarg[YYERROR_VERBOSE_ARGS_MAXIMUM];

    /* There are many possibilities here to consider:
       - If this state is a consistent state with a default action, then
         the only way this function was invoked is if the default action
         is an error action.  In that case, don't check for expected
         tokens because there are none.
       - The only way there can be no lookahead present (in yyla) is
         if this state is a consistent state with a default action.
         Thus, detecting the absence of a lookahead is sufficient to
         determine that there is no unexpected or expected token to
         report.  In that case, just report a simple "syntax error".
       - Don't assume there isn't a lookahead just because this state is
         a consistent state with a default action.  There might have
         been a previous inconsistent state, consistent state with a
         non-default action, or user semantic action that manipulated
         yyla.  (However, yyla is currently not documented for users.)
       - Of course, the expected token list depends on states to have
         correct lookahead information, and it depends on the parser not
         to perform extra reductions after fetching a lookahead from the
         scanner and before detecting a syntax error.  Thus, state merging
         (from LALR or IELR) and default reductions corrupt the expected
         token list.  However, the list is correct for canonical LR with
         one exception: it will still contain any token that will not be
         accepted due to an error action in a later state.
    */
    if (!yyla.empty ())
      {
        symbol_number_type yytoken = yyla.type_get ();
        yyarg[yycount++] = yytname_[yytoken];

        int yyn = yypact_[yystate];
        if (!yy_pact_value_is_default_ (yyn))
          {
            /* Start YYX at -YYN if negative to avoid negative indexes in
               YYCHECK.  In other words, skip the first -YYN actions for
               this state because they are default actions.  */
            int yyxbegin = yyn < 0 ? -yyn : 0;
            // Stay within bounds of both yycheck and yytname.
            int yychecklim = yylast_ - yyn + 1;
            int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
            for (int yyx = yyxbegin; yyx < yyxend; ++yyx)
              if (yycheck_[yyx + yyn] == yyx && yyx != yy_error_token_
                  && !yy_table_value_is_error_ (yytable_[yyx + yyn]))
                {
                  if (yycount == YYERROR_VERBOSE_ARGS_MAXIMUM)
                    {
                      yycount = 1;
                      break;
                    }
                  else
                    yyarg[yycount++] = yytname_[yyx];
                }
          }
      }

    char const* yyformat = YY_NULLPTR;
    switch (yycount)
      {
#define YYCASE_(N, S)                         \
        case N:                               \
          yyformat = S;                       \
        break
      default: // Avoid compiler warnings.
        YYCASE_ (0, YY_("syntax error"));
        YYCASE_ (1, YY_("syntax error, unexpected %s"));
        YYCASE_ (2, YY_("syntax error, unexpected %s, expecting %s"));
        YYCASE_ (3, YY_("syntax error, unexpected %s, expecting %s or %s"));
        YYCASE_ (4, YY_("syntax error, unexpected %s, expecting %s or %s or %s"));
        YYCASE_ (5, YY_("syntax error, unexpected %s, expecting %s or %s or %s or %s"));
#undef YYCASE_
      }

    std::string yyres;
    // Argument number.
    std::ptrdiff_t yyi = 0;
    for (char const* yyp = yyformat; *yyp; ++yyp)
      if (yyp[0] == '%' && yyp[1] == 's' && yyi < yycount)
        {
          yyres += yytnamerr_ (yyarg[yyi++]);
          ++yyp;
        }
      else
        yyres += *yyp;
    return yyres;
  }


  const short Smt2Parser::yypact_ninf_ = -250;

  const signed char Smt2Parser::yytable_ninf_ = -1;

  const short
  Smt2Parser::yypact_[] =
  {
     -61,     1,    25,    28,   -61,  -250,  -250,  -250,  -250,  -250,
    -250,  -250,  -250,  -250,  -250,  -250,  -250,  -250,  -250,  -250,
     261,   -53,   -48,   -47,   -43,   -46,   -42,   -12,   -13,    -8,
      -4,    -1,     5,     6,   261,   261,  -250,  -250,  -250,  -250,
    -250,  -250,  -250,  -250,  -250,   209,     2,  -250,    12,    10,
    -250,  -250,  -250,    13,   261,    14,    15,   -54,    16,   -60,
      17,    26,  -250,  -250,   261,   261,   261,   261,   261,   261,
     261,   261,   261,   261,   261,   261,   261,   261,   261,   261,
     261,   261,   261,   261,   261,   261,   261,   261,   261,   261,
     261,   261,   261,   261,   261,   261,   261,  -250,  -250,   -82,
      27,    29,  -250,    11,  -250,  -250,  -250,    30,    31,    33,
    -250,    34,    35,    38,    44,  -250,  -250,    48,    50,    76,
      90,   261,   261,   261,   261,   261,   261,   261,    51,    56,
      57,    58,    61,    63,    65,    77,    78,   261,    79,    80,
      87,   261,   261,    88,   261,    98,   116,   124,   261,    95,
     261,   146,  -250,   261,    12,   102,   103,  -250,  -250,  -250,
    -250,  -250,  -250,  -250,  -250,   105,   106,   261,  -250,   217,
    -250,   225,   239,   247,   113,   114,   121,   122,   125,  -250,
    -250,  -250,  -250,  -250,  -250,  -250,  -250,  -250,   127,  -250,
    -250,  -250,   131,   132,  -250,   134,  -250,  -250,  -250,   138,
    -250,   261,  -250,   100,   -80,    54,   102,   144,  -250,   110,
     147,   105,   152,   150,   106,  -250,  -250,  -250,  -250,  -250,
    -250,  -250,  -250,  -250,  -250,  -250,  -250,  -250,  -250,  -250,
     151,   261,  -250,   261,    12,  -250,    12,    12,   261,  -250,
     261,  -250,  -250,   154,  -250,     9,   153,   156,   261,   -75,
    -250,   157,  -250,   158,   261,  -250,  -250,  -250,   261,   159,
    -250,  -250,   149,   160,   162,  -250,   161,  -250,   261,  -250,
     189,   165,  -250
  };

  const signed char
  Smt2Parser::yydefact_[] =
  {
       0,     0,     0,     0,     3,     5,     6,     7,     8,     9,
      10,    11,    12,    13,    16,    17,    18,    19,    15,    14,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     1,     2,     4,    45,
      46,    60,    61,    62,    63,     0,     0,    21,     0,     0,
      89,    27,    28,     0,     0,     0,     0,     0,     0,     0,
       0,     0,    89,    89,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,    20,    98,     0,
       0,     0,    40,     0,    43,    42,    41,     0,     0,     0,
      35,     0,     0,     0,     0,    30,    31,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,    24,     0,     0,    92,     0,    44,    34,    32,
      33,    38,    39,    37,    36,    94,    99,     0,    64,     0,
      66,     0,     0,     0,     0,     0,     0,     0,     0,    70,
      71,    72,    73,    74,    75,    76,    77,    78,     0,    80,
      81,    82,     0,     0,    85,     0,    52,    53,    54,     0,
      55,     0,    87,     0,     0,     0,    92,     0,    29,     0,
       0,    94,     0,     0,    99,    90,    65,    67,    68,    69,
      47,    49,    51,    48,    50,    79,    83,    84,    86,    56,
       0,     0,    22,     0,     0,    93,     0,     0,     0,    95,
       0,    88,   100,     0,    57,     0,     0,     0,     0,     0,
      90,     0,    59,     0,     0,    91,    90,    96,     0,     0,
     101,    25,     0,     0,     0,    58,     0,    26,     0,    23,
       0,     0,    97
  };

  const short
  Smt2Parser::yypgoto_[] =
  {
    -250,  -250,   243,  -250,  -250,  -250,  -250,  -250,  -250,  -250,
    -250,  -250,  -250,  -250,  -250,  -250,  -250,  -250,  -250,    18,
     -20,  -250,   -50,  -249,  -250,    72,    81,  -250,  -152,    73,
    -250
  };

  const short
  Smt2Parser::yydefgoto_[] =
  {
      -1,     2,     3,     4,     5,     6,     7,     8,     9,    10,
      11,    12,    13,    14,    15,    16,    17,    18,    19,   103,
     104,   167,   101,   243,   206,   207,   210,   211,    99,   213,
     214
  };

  const short
  Smt2Parser::yytable_[] =
  {
      46,   259,   204,   152,   153,   232,   233,   263,   111,   112,
     257,   258,   117,   118,    60,    61,    20,    21,   113,    22,
      23,   114,    24,     1,   107,    36,    25,   108,    37,   109,
      26,    27,    47,    48,    49,    28,    29,    30,    50,    51,
      31,    32,    33,    52,   119,   120,   121,   122,   123,   124,
     125,   126,   127,   128,   129,   130,   131,   132,   133,   134,
     135,   136,   137,   138,   139,   140,   141,   142,   143,   144,
      53,    54,    55,   148,   149,   150,    56,    34,    35,    39,
      40,    57,   247,   157,   248,   249,    58,    97,    59,    41,
      42,    43,    44,    98,   100,    45,   156,   253,   102,   105,
     106,   110,   115,   174,   175,   176,   177,   178,   145,   146,
     147,   116,   154,   155,   151,   158,   159,   188,   160,   161,
     162,   192,   193,   163,   195,   157,   157,   157,   199,   164,
     201,   157,   165,   203,   166,   234,   179,   169,   171,   172,
     173,   180,   181,   182,    39,    40,   183,   215,   184,   157,
     185,   157,   157,   157,    41,    42,    43,    44,    39,    40,
      45,   168,   186,   187,   189,   190,    39,    40,    41,    42,
      43,    44,   191,   194,    45,   170,    41,    42,    43,    44,
     200,   230,    45,   196,    39,    40,   205,   231,   208,   209,
     212,   237,    39,    40,    41,    42,    43,    44,   220,   221,
      45,   197,    41,    42,    43,    44,   222,   223,    45,   198,
     224,   245,   225,   246,    39,    40,   226,   227,   250,   228,
     251,    62,    63,   229,    41,    42,    43,    44,   256,   236,
      45,   202,   238,   240,   262,   241,   244,   266,   264,   252,
     254,   255,   260,   261,   265,   267,   269,    38,   270,   268,
     272,    64,    65,    66,    67,    68,    69,    70,    71,    72,
      73,    74,    75,    76,    77,    78,    79,    80,    81,    82,
      83,    84,    85,    86,    87,    88,    89,   271,   235,    90,
      91,    92,    93,    94,    95,    39,    40,   242,     0,     0,
      96,     0,   239,    39,    40,    41,    42,    43,    44,     0,
       0,    45,   216,    41,    42,    43,    44,    39,    40,    45,
     217,     0,     0,     0,     0,    39,    40,    41,    42,    43,
      44,     0,     0,    45,   218,    41,    42,    43,    44,    39,
      40,    45,   219,     0,     0,     0,     0,     0,     0,    41,
      42,    43,    44,     0,     0,    45
  };

  const short
  Smt2Parser::yycheck_[] =
  {
      20,   250,   154,    85,    86,    85,    86,   256,    68,    69,
      85,    86,    62,    63,    34,    35,    15,    16,    78,    18,
      19,    81,    21,    84,    78,     0,    25,    81,     0,    83,
      29,    30,    85,    81,    81,    34,    35,    36,    81,    85,
      39,    40,    41,    85,    64,    65,    66,    67,    68,    69,
      70,    71,    72,    73,    74,    75,    76,    77,    78,    79,
      80,    81,    82,    83,    84,    85,    86,    87,    88,    89,
      82,    84,    80,    93,    94,    95,    80,    76,    77,    68,
      69,    82,   234,   103,   236,   237,    81,    85,    82,    78,
      79,    80,    81,    81,    84,    84,    85,    88,    85,    85,
      85,    85,    85,   123,   124,   125,   126,   127,    90,    91,
      92,    85,    85,    84,    96,    85,    85,   137,    85,    85,
      85,   141,   142,    85,   144,   145,   146,   147,   148,    85,
     150,   151,    84,   153,    84,    81,    85,   119,   120,   121,
     122,    85,    85,    85,    68,    69,    85,   167,    85,   169,
      85,   171,   172,   173,    78,    79,    80,    81,    68,    69,
      84,    85,    85,    85,    85,    85,    68,    69,    78,    79,
      80,    81,    85,    85,    84,    85,    78,    79,    80,    81,
      85,   201,    84,    85,    68,    69,    84,    87,    85,    84,
      84,    81,    68,    69,    78,    79,    80,    81,    85,    85,
      84,    85,    78,    79,    80,    81,    85,    85,    84,    85,
      85,   231,    85,   233,    68,    69,    85,    85,   238,    85,
     240,    12,    13,    85,    78,    79,    80,    81,   248,    85,
      84,    85,    85,    81,   254,    85,    85,    88,   258,    85,
      87,    85,    85,    85,    85,    85,    85,     4,   268,    87,
      85,    42,    43,    44,    45,    46,    47,    48,    49,    50,
      51,    52,    53,    54,    55,    56,    57,    58,    59,    60,
      61,    62,    63,    64,    65,    66,    67,    88,   206,    70,
      71,    72,    73,    74,    75,    68,    69,   214,    -1,    -1,
      81,    -1,   211,    68,    69,    78,    79,    80,    81,    -1,
      -1,    84,    85,    78,    79,    80,    81,    68,    69,    84,
      85,    -1,    -1,    -1,    -1,    68,    69,    78,    79,    80,
      81,    -1,    -1,    84,    85,    78,    79,    80,    81,    68,
      69,    84,    85,    -1,    -1,    -1,    -1,    -1,    -1,    78,
      79,    80,    81,    -1,    -1,    84
  };

  const signed char
  Smt2Parser::yystos_[] =
  {
       0,    84,    90,    91,    92,    93,    94,    95,    96,    97,
      98,    99,   100,   101,   102,   103,   104,   105,   106,   107,
      15,    16,    18,    19,    21,    25,    29,    30,    34,    35,
      36,    39,    40,    41,    76,    77,     0,     0,    91,    68,
      69,    78,    79,    80,    81,    84,   109,    85,    81,    81,
      81,    85,    85,    82,    84,    80,    80,    82,    81,    82,
     109,   109,    12,    13,    42,    43,    44,    45,    46,    47,
      48,    49,    50,    51,    52,    53,    54,    55,    56,    57,
      58,    59,    60,    61,    62,    63,    64,    65,    66,    67,
      70,    71,    72,    73,    74,    75,    81,    85,    81,   117,
      84,   111,    85,   108,   109,    85,    85,    78,    81,    83,
      85,    68,    69,    78,    81,    85,    85,   111,   111,   109,
     109,   109,   109,   109,   109,   109,   109,   109,   109,   109,
     109,   109,   109,   109,   109,   109,   109,   109,   109,   109,
     109,   109,   109,   109,   109,   108,   108,   108,   109,   109,
     109,   108,    85,    86,    85,    84,    85,   109,    85,    85,
      85,    85,    85,    85,    85,    84,    84,   110,    85,   108,
      85,   108,   108,   108,   109,   109,   109,   109,   109,    85,
      85,    85,    85,    85,    85,    85,    85,    85,   109,    85,
      85,    85,   109,   109,    85,   109,    85,    85,    85,   109,
      85,   109,    85,   109,   117,    84,   113,   114,    85,    84,
     115,   116,    84,   118,   119,   109,    85,    85,    85,    85,
      85,    85,    85,    85,    85,    85,    85,    85,    85,    85,
     109,    87,    85,    86,    81,   114,    85,    81,    85,   115,
      81,    85,   118,   112,    85,   109,   109,   117,   117,   117,
     109,   109,    85,    88,    87,    85,   109,    85,    86,   112,
      85,    85,   109,   112,   109,    85,    88,    85,    87,    85,
     109,    88,    85
  };

  const signed char
  Smt2Parser::yyr1_[] =
  {
       0,    89,    90,    91,    91,    92,    92,    92,    92,    92,
      92,    92,    92,    92,    92,    92,    92,    92,    92,    92,
      93,    94,    95,    95,    95,    95,    96,    97,    98,    99,
     100,   101,   102,   102,   102,   103,   104,   104,   104,   104,
     105,   106,   107,   108,   108,   109,   109,   109,   109,   109,
     109,   109,   109,   109,   109,   109,   109,   109,   109,   109,
     109,   109,   109,   109,   109,   109,   109,   109,   109,   109,
     109,   109,   109,   109,   109,   109,   109,   109,   109,   109,
     109,   109,   109,   109,   109,   109,   109,   109,   110,   111,
     112,   113,   114,   114,   115,   115,   116,   116,   117,   118,
     118,   119
  };

  const signed char
  Smt2Parser::yyr2_[] =
  {
       0,     2,     2,     1,     2,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       4,     3,     7,    12,     5,    10,    11,     3,     3,     6,
       4,     4,     5,     5,     5,     4,     5,     5,     5,     5,
       4,     4,     4,     1,     2,     1,     1,     5,     5,     5,
       5,     5,     4,     4,     4,     4,     5,     6,     9,     7,
       1,     1,     1,     1,     4,     5,     4,     5,     5,     5,
       4,     4,     4,     4,     4,     4,     4,     4,     4,     5,
       4,     4,     4,     5,     5,     4,     5,     4,     3,     0,
       0,     4,     0,     2,     0,     2,     4,     9,     1,     0,
       2,     4
  };



  // YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
  // First, the terminals, then, starting at \a yyntokens_, nonterminals.
  const char*
  const Smt2Parser::yytname_[] =
  {
  "\"end of file\"", "error", "$undefined", "TK_EXCLAMATION", "TK_BINARY",
  "TK_DECIMAL", "TK_HEXADECIMAL", "TK_NUMERAL", "TK_STRING",
  "TK_UNDERSCORE", "TK_AS", "TK_EXISTS", "TK_FORALL", "TK_LET", "TK_PAR",
  "TK_ASSERT", "TK_CHECK_SAT", "TK_CHECK_SAT_ASSUMING", "TK_DECLARE_CONST",
  "TK_DECLARE_FUN", "TK_DECLARE_SORT", "TK_DEFINE_FUN",
  "TK_DEFINE_FUN_REC", "TK_DEFINE_SORT", "TK_ECHO", "TK_EXIT",
  "TK_GET_ASSERTIONS", "TK_GET_ASSIGNMENT", "TK_GET_INFO", "TK_GET_MODEL",
  "TK_GET_OPTION", "TK_GET_PROOF", "TK_GET_UNSAT_ASSUMPTIONS",
  "TK_GET_UNSAT_CORE", "TK_GET_VALUE", "TK_POP", "TK_PUSH", "TK_RESET",
  "TK_RESET_ASSERTIONS", "TK_SET_INFO", "TK_SET_LOGIC", "TK_SET_OPTION",
  "TK_PLUS", "TK_MINUS", "TK_TIMES", "TK_DIV", "TK_EQ", "TK_LTE", "TK_GTE",
  "TK_LT", "TK_GT", "TK_EXP", "TK_LOG", "TK_ABS", "TK_SIN", "TK_COS",
  "TK_TAN", "TK_ASIN", "TK_ACOS", "TK_ATAN", "TK_ATAN2", "TK_SINH",
  "TK_COSH", "TK_TANH", "TK_MIN", "TK_MAX", "TK_SQRT", "TK_POW", "TK_TRUE",
  "TK_FALSE", "TK_AND", "TK_OR", "TK_XOR", "TK_IMPLIES", "TK_NOT",
  "TK_ITE", "TK_MAXIMIZE", "TK_MINIMIZE", "\"double\"", "\"hexfloat\"",
  "\"int64\"", "\"symbol\"", "\"keyword\"", "\"string\"", "'('", "')'",
  "'['", "','", "']'", "$accept", "script", "command_list", "command",
  "command_assert", "command_check_sat", "command_declare_fun",
  "command_define_fun", "command_exit", "command_get_model",
  "command_get_value", "command_maximize", "command_minimize",
  "command_set_info", "command_set_logic", "command_set_option",
  "command_get_option", "command_push", "command_pop", "term_list", "term",
  "let_binding_list", "enter_scope", "exit_scope", "name_sort",
  "name_sort_list", "variable_sort_list", "variable_sort", "sort",
  "var_binding_list", "var_binding", YY_NULLPTR
  };

#if DREALDEBUG
  const short
  Smt2Parser::yyrline_[] =
  {
       0,   123,   123,   126,   127,   131,   132,   133,   134,   135,
     136,   137,   138,   139,   140,   141,   142,   143,   144,   145,
     148,   153,   158,   162,   166,   170,   176,   191,   198,   204,
     209,   214,   220,   225,   230,   237,   244,   249,   254,   259,
     267,   274,   279,   284,   285,   288,   289,   290,   309,   310,
     311,   312,   313,   320,   327,   334,   337,   340,   364,   375,
     378,   389,   390,   391,   404,   407,   413,   416,   422,   428,
     434,   437,   440,   443,   446,   449,   452,   455,   458,   461,
     464,   467,   470,   473,   476,   479,   482,   485,   490,   509,
     514,   519,   524,   525,   533,   534,   549,   554,   562,   565,
     568,   574
  };

  // Print the state stack on the debug stream.
  void
  Smt2Parser::yystack_print_ ()
  {
    *yycdebug_ << "Stack now";
    for (stack_type::const_iterator
           i = yystack_.begin (),
           i_end = yystack_.end ();
         i != i_end; ++i)
      *yycdebug_ << ' ' << int (i->state);
    *yycdebug_ << '\n';
  }

  // Report on the debug stream that the rule \a yyrule is going to be reduced.
  void
  Smt2Parser::yy_reduce_print_ (int yyrule)
  {
    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    // Print the symbols being reduced, and their result.
    *yycdebug_ << "Reducing stack by rule " << yyrule - 1
               << " (line " << yylno << "):\n";
    // The symbols being reduced.
    for (int yyi = 0; yyi < yynrhs; yyi++)
      YY_SYMBOL_PRINT ("   $" << yyi + 1 << " =",
                       yystack_[(yynrhs) - (yyi + 1)]);
  }
#endif // DREALDEBUG

  Smt2Parser::token_number_type
  Smt2Parser::yytranslate_ (int t)
  {
    // YYTRANSLATE[TOKEN-NUM] -- Symbol number corresponding to
    // TOKEN-NUM as returned by yylex.
    static
    const token_number_type
    translate_table[] =
    {
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
      84,    85,     2,     2,    87,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,    86,     2,    88,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    60,    61,    62,    63,    64,
      65,    66,    67,    68,    69,    70,    71,    72,    73,    74,
      75,    76,    77,    78,    79,    80,    81,    82,    83
    };
    const int user_token_number_max_ = 338;

    if (t <= 0)
      return yyeof_;
    else if (t <= user_token_number_max_)
      return translate_table[t];
    else
      return yy_undef_token_;
  }

} // dreal
#line 2532 "bazel-out/k8-opt/bin/dreal/smt2/parser.yy.cc"

#line 580 "dreal/smt2/parser.yy"
 /*** Additional Code ***/
void dreal::Smt2Parser::error(const Smt2Parser::location_type& l,
                              const std::string& m) {
    driver.error(l, m);
}

#ifdef __clang__
#pragma clang diagnostic pop
#endif
#pragma GCC diagnostic pop

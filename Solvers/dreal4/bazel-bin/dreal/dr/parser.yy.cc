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
#line 1 "dreal/dr/parser.yy"


#include <iostream>
#include <string>

#include "dreal/symbolic/symbolic.h"

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
#line 89 "dreal/dr/parser.yy"


#include "dreal/dr/driver.h"
#include "dreal/dr/scanner.h"

/* this "connects" the bison parser in the driver to the flex scanner class
 * object. it defines the yylex() function call to pull the next token from the
 * current lexer object of the driver context. */
#undef yylex
#define yylex driver.scanner_->lex


#line 75 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"


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
#line 171 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"


  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  std::string
  DrParser::yytnamerr_ (const char *yystr)
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
  DrParser::DrParser (class DrDriver& driver_yyarg)
#if DREALDEBUG
    : yydebug_ (false),
      yycdebug_ (&std::cerr),
#else
    :
#endif
      driver (driver_yyarg)
  {}

  DrParser::~DrParser ()
  {}

  DrParser::syntax_error::~syntax_error () YY_NOEXCEPT YY_NOTHROW
  {}

  /*---------------.
  | Symbol types.  |
  `---------------*/

  // basic_symbol.
#if 201103L <= YY_CPLUSPLUS
  template <typename Base>
  DrParser::basic_symbol<Base>::basic_symbol (basic_symbol&& that)
    : Base (std::move (that))
    , value ()
    , location (std::move (that.location))
  {
    switch (this->type_get ())
    {
      case 64: // expr
        value.move< Expression > (std::move (that.value));
        break;

      case 63: // formula
        value.move< Formula > (std::move (that.value));
        break;

      case 43: // "double"
        value.move< double > (std::move (that.value));
        break;

      case 44: // "identifier"
        value.move< std::string > (std::move (that.value));
        break;

      default:
        break;
    }

  }
#endif

  template <typename Base>
  DrParser::basic_symbol<Base>::basic_symbol (const basic_symbol& that)
    : Base (that)
    , value ()
    , location (that.location)
  {
    switch (this->type_get ())
    {
      case 64: // expr
        value.copy< Expression > (YY_MOVE (that.value));
        break;

      case 63: // formula
        value.copy< Formula > (YY_MOVE (that.value));
        break;

      case 43: // "double"
        value.copy< double > (YY_MOVE (that.value));
        break;

      case 44: // "identifier"
        value.copy< std::string > (YY_MOVE (that.value));
        break;

      default:
        break;
    }

  }



  template <typename Base>
  bool
  DrParser::basic_symbol<Base>::empty () const YY_NOEXCEPT
  {
    return Base::type_get () == empty_symbol;
  }

  template <typename Base>
  void
  DrParser::basic_symbol<Base>::move (basic_symbol& s)
  {
    super_type::move (s);
    switch (this->type_get ())
    {
      case 64: // expr
        value.move< Expression > (YY_MOVE (s.value));
        break;

      case 63: // formula
        value.move< Formula > (YY_MOVE (s.value));
        break;

      case 43: // "double"
        value.move< double > (YY_MOVE (s.value));
        break;

      case 44: // "identifier"
        value.move< std::string > (YY_MOVE (s.value));
        break;

      default:
        break;
    }

    location = YY_MOVE (s.location);
  }

  // by_type.
  DrParser::by_type::by_type ()
    : type (empty_symbol)
  {}

#if 201103L <= YY_CPLUSPLUS
  DrParser::by_type::by_type (by_type&& that)
    : type (that.type)
  {
    that.clear ();
  }
#endif

  DrParser::by_type::by_type (const by_type& that)
    : type (that.type)
  {}

  DrParser::by_type::by_type (token_type t)
    : type (yytranslate_ (t))
  {}

  void
  DrParser::by_type::clear ()
  {
    type = empty_symbol;
  }

  void
  DrParser::by_type::move (by_type& that)
  {
    type = that.type;
    that.clear ();
  }

  int
  DrParser::by_type::type_get () const YY_NOEXCEPT
  {
    return type;
  }


  // by_state.
  DrParser::by_state::by_state () YY_NOEXCEPT
    : state (empty_state)
  {}

  DrParser::by_state::by_state (const by_state& that) YY_NOEXCEPT
    : state (that.state)
  {}

  void
  DrParser::by_state::clear () YY_NOEXCEPT
  {
    state = empty_state;
  }

  void
  DrParser::by_state::move (by_state& that)
  {
    state = that.state;
    that.clear ();
  }

  DrParser::by_state::by_state (state_type s) YY_NOEXCEPT
    : state (s)
  {}

  DrParser::symbol_number_type
  DrParser::by_state::type_get () const YY_NOEXCEPT
  {
    if (state == empty_state)
      return empty_symbol;
    else
      return yystos_[state];
  }

  DrParser::stack_symbol_type::stack_symbol_type ()
  {}

  DrParser::stack_symbol_type::stack_symbol_type (YY_RVREF (stack_symbol_type) that)
    : super_type (YY_MOVE (that.state), YY_MOVE (that.location))
  {
    switch (that.type_get ())
    {
      case 64: // expr
        value.YY_MOVE_OR_COPY< Expression > (YY_MOVE (that.value));
        break;

      case 63: // formula
        value.YY_MOVE_OR_COPY< Formula > (YY_MOVE (that.value));
        break;

      case 43: // "double"
        value.YY_MOVE_OR_COPY< double > (YY_MOVE (that.value));
        break;

      case 44: // "identifier"
        value.YY_MOVE_OR_COPY< std::string > (YY_MOVE (that.value));
        break;

      default:
        break;
    }

#if 201103L <= YY_CPLUSPLUS
    // that is emptied.
    that.state = empty_state;
#endif
  }

  DrParser::stack_symbol_type::stack_symbol_type (state_type s, YY_MOVE_REF (symbol_type) that)
    : super_type (s, YY_MOVE (that.location))
  {
    switch (that.type_get ())
    {
      case 64: // expr
        value.move< Expression > (YY_MOVE (that.value));
        break;

      case 63: // formula
        value.move< Formula > (YY_MOVE (that.value));
        break;

      case 43: // "double"
        value.move< double > (YY_MOVE (that.value));
        break;

      case 44: // "identifier"
        value.move< std::string > (YY_MOVE (that.value));
        break;

      default:
        break;
    }

    // that is emptied.
    that.type = empty_symbol;
  }

#if YY_CPLUSPLUS < 201103L
  DrParser::stack_symbol_type&
  DrParser::stack_symbol_type::operator= (const stack_symbol_type& that)
  {
    state = that.state;
    switch (that.type_get ())
    {
      case 64: // expr
        value.copy< Expression > (that.value);
        break;

      case 63: // formula
        value.copy< Formula > (that.value);
        break;

      case 43: // "double"
        value.copy< double > (that.value);
        break;

      case 44: // "identifier"
        value.copy< std::string > (that.value);
        break;

      default:
        break;
    }

    location = that.location;
    return *this;
  }

  DrParser::stack_symbol_type&
  DrParser::stack_symbol_type::operator= (stack_symbol_type& that)
  {
    state = that.state;
    switch (that.type_get ())
    {
      case 64: // expr
        value.move< Expression > (that.value);
        break;

      case 63: // formula
        value.move< Formula > (that.value);
        break;

      case 43: // "double"
        value.move< double > (that.value);
        break;

      case 44: // "identifier"
        value.move< std::string > (that.value);
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
  DrParser::yy_destroy_ (const char* yymsg, basic_symbol<Base>& yysym) const
  {
    if (yymsg)
      YY_SYMBOL_PRINT (yymsg, yysym);
  }

#if DREALDEBUG
  template <typename Base>
  void
  DrParser::yy_print_ (std::ostream& yyo,
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
  DrParser::yypush_ (const char* m, YY_MOVE_REF (stack_symbol_type) sym)
  {
    if (m)
      YY_SYMBOL_PRINT (m, sym);
    yystack_.push (YY_MOVE (sym));
  }

  void
  DrParser::yypush_ (const char* m, state_type s, YY_MOVE_REF (symbol_type) sym)
  {
#if 201103L <= YY_CPLUSPLUS
    yypush_ (m, stack_symbol_type (s, std::move (sym)));
#else
    stack_symbol_type ss (s, sym);
    yypush_ (m, ss);
#endif
  }

  void
  DrParser::yypop_ (int n)
  {
    yystack_.pop (n);
  }

#if DREALDEBUG
  std::ostream&
  DrParser::debug_stream () const
  {
    return *yycdebug_;
  }

  void
  DrParser::set_debug_stream (std::ostream& o)
  {
    yycdebug_ = &o;
  }


  DrParser::debug_level_type
  DrParser::debug_level () const
  {
    return yydebug_;
  }

  void
  DrParser::set_debug_level (debug_level_type l)
  {
    yydebug_ = l;
  }
#endif // DREALDEBUG

  DrParser::state_type
  DrParser::yy_lr_goto_state_ (state_type yystate, int yysym)
  {
    int yyr = yypgoto_[yysym - yyntokens_] + yystate;
    if (0 <= yyr && yyr <= yylast_ && yycheck_[yyr] == yystate)
      return yytable_[yyr];
    else
      return yydefgoto_[yysym - yyntokens_];
  }

  bool
  DrParser::yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  bool
  DrParser::yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  int
  DrParser::operator() ()
  {
    return parse ();
  }

  int
  DrParser::parse ()
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
#line 46 "dreal/dr/parser.yy"
{
    // initialize the initial location object
    yyla.location.begin.filename = yyla.location.end.filename = &driver.streamname_;
}

#line 686 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"


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
      case 64: // expr
        yylhs.value.emplace< Expression > ();
        break;

      case 63: // formula
        yylhs.value.emplace< Formula > ();
        break;

      case 43: // "double"
        yylhs.value.emplace< double > ();
        break;

      case 44: // "identifier"
        yylhs.value.emplace< std::string > ();
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
  case 2:
#line 107 "dreal/dr/parser.yy"
                {
                    driver.Solve();
		}
#line 830 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 6:
#line 122 "dreal/dr/parser.yy"
                                                               {
                    driver.DeclareVariable(Variable{yystack_[1].value.as < std::string > (), Variable::Type::CONTINUOUS}, yystack_[5].value.as < Expression > ().Evaluate(), yystack_[3].value.as < Expression > ().Evaluate());
                }
#line 838 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 7:
#line 125 "dreal/dr/parser.yy"
                                     {
                    driver.DeclareVariable(Variable{yystack_[1].value.as < std::string > (), Variable::Type::CONTINUOUS}, yystack_[2].value.as < Expression > ().Evaluate(), yystack_[2].value.as < Expression > ().Evaluate());
        }
#line 846 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 13:
#line 144 "dreal/dr/parser.yy"
                                      {
                     driver.Assert(yystack_[1].value.as < Formula > ());
        }
#line 854 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 18:
#line 160 "dreal/dr/parser.yy"
                                 {
                     driver.Minimize(yystack_[1].value.as < Expression > ());
        }
#line 862 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 19:
#line 169 "dreal/dr/parser.yy"
                                           { yylhs.value.as < Formula > () = yystack_[2].value.as < Expression > () == yystack_[0].value.as < Expression > (); }
#line 868 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 20:
#line 170 "dreal/dr/parser.yy"
                                           { yylhs.value.as < Formula > () = yystack_[2].value.as < Expression > () < yystack_[0].value.as < Expression > (); }
#line 874 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 21:
#line 171 "dreal/dr/parser.yy"
                                           { yylhs.value.as < Formula > () = yystack_[2].value.as < Expression > () <= yystack_[0].value.as < Expression > (); }
#line 880 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 22:
#line 172 "dreal/dr/parser.yy"
                                           { yylhs.value.as < Formula > () = yystack_[2].value.as < Expression > () > yystack_[0].value.as < Expression > (); }
#line 886 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 23:
#line 173 "dreal/dr/parser.yy"
                                           { yylhs.value.as < Formula > () = yystack_[2].value.as < Expression > () >= yystack_[0].value.as < Expression > (); }
#line 892 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 24:
#line 174 "dreal/dr/parser.yy"
                                           { yylhs.value.as < Formula > () = yystack_[2].value.as < Formula > () && yystack_[0].value.as < Formula > (); }
#line 898 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 25:
#line 175 "dreal/dr/parser.yy"
                                           { yylhs.value.as < Formula > () = yystack_[2].value.as < Formula > () || yystack_[0].value.as < Formula > (); }
#line 904 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 26:
#line 176 "dreal/dr/parser.yy"
                                           { yylhs.value.as < Formula > () = !yystack_[2].value.as < Formula > () || yystack_[0].value.as < Formula > (); }
#line 910 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 27:
#line 177 "dreal/dr/parser.yy"
                                           { yylhs.value.as < Formula > () = !yystack_[0].value.as < Formula > (); }
#line 916 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 28:
#line 178 "dreal/dr/parser.yy"
                                           { yylhs.value.as < Formula > () = yystack_[1].value.as < Formula > (); }
#line 922 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 29:
#line 184 "dreal/dr/parser.yy"
                       { yylhs.value.as < Expression > () = yystack_[0].value.as < double > (); }
#line 928 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 30:
#line 185 "dreal/dr/parser.yy"
                   {
	    try {
		const Variable& var = driver.lookup_variable(yystack_[0].value.as < std::string > ());
	        yylhs.value.as < Expression > () = var;
            } catch (std::runtime_error& e) {
		std::cerr << yystack_[0].location << " : " << e.what() << std::endl;
		YYABORT;
	    }
	}
#line 942 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 31:
#line 194 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = yystack_[2].value.as < Expression > () + yystack_[0].value.as < Expression > (); }
#line 948 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 32:
#line 195 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = -yystack_[0].value.as < Expression > (); }
#line 954 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 33:
#line 196 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = yystack_[2].value.as < Expression > () - yystack_[0].value.as < Expression > (); }
#line 960 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 34:
#line 197 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = yystack_[2].value.as < Expression > () * yystack_[0].value.as < Expression > (); }
#line 966 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 35:
#line 198 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = yystack_[2].value.as < Expression > () / yystack_[0].value.as < Expression > (); }
#line 972 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 36:
#line 199 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = exp(yystack_[1].value.as < Expression > ()); }
#line 978 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 37:
#line 200 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = log(yystack_[1].value.as < Expression > ()); }
#line 984 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 38:
#line 201 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = abs(yystack_[1].value.as < Expression > ()); }
#line 990 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 39:
#line 202 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = sin(yystack_[1].value.as < Expression > ()); }
#line 996 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 40:
#line 203 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = cos(yystack_[1].value.as < Expression > ()); }
#line 1002 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 41:
#line 204 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = tan(yystack_[1].value.as < Expression > ()); }
#line 1008 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 42:
#line 205 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = asin(yystack_[1].value.as < Expression > ()); }
#line 1014 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 43:
#line 206 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = acos(yystack_[1].value.as < Expression > ()); }
#line 1020 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 44:
#line 207 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = atan(yystack_[1].value.as < Expression > ()); }
#line 1026 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 45:
#line 208 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = atan2(yystack_[3].value.as < Expression > (), yystack_[1].value.as < Expression > ()); }
#line 1032 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 46:
#line 209 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = sinh(yystack_[1].value.as < Expression > ()); }
#line 1038 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 47:
#line 210 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = cosh(yystack_[1].value.as < Expression > ()); }
#line 1044 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 48:
#line 211 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = tanh(yystack_[1].value.as < Expression > ()); }
#line 1050 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 49:
#line 212 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = min(yystack_[3].value.as < Expression > (), yystack_[1].value.as < Expression > ()); }
#line 1056 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 50:
#line 213 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = max(yystack_[3].value.as < Expression > (), yystack_[1].value.as < Expression > ()); }
#line 1062 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 51:
#line 214 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = sqrt(yystack_[1].value.as < Expression > ()); }
#line 1068 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 52:
#line 215 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = pow(yystack_[3].value.as < Expression > (), yystack_[1].value.as < Expression > ()); }
#line 1074 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 53:
#line 216 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = pow(yystack_[2].value.as < Expression > (), yystack_[0].value.as < Expression > ()); }
#line 1080 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;

  case 54:
#line 217 "dreal/dr/parser.yy"
                                                    { yylhs.value.as < Expression > () = yystack_[1].value.as < Expression > (); }
#line 1086 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"
    break;


#line 1090 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"

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
  DrParser::error (const syntax_error& yyexc)
  {
    error (yyexc.location, yyexc.what ());
  }

  // Generate an error message.
  std::string
  DrParser::yysyntax_error_ (state_type yystate, const symbol_type& yyla) const
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


  const signed char DrParser::yypact_ninf_ = -50;

  const signed char DrParser::yytable_ninf_ = -1;

  const short
  DrParser::yypact_[] =
  {
      16,   -11,    30,    25,   281,   -50,    36,    73,   -50,   349,
      29,    31,    32,    33,    37,    38,    49,    58,    59,    62,
      63,    69,    70,    74,    81,    93,   107,   349,   -50,   -50,
     349,   -50,   281,   250,   315,    39,   -50,    52,   349,   349,
     349,   349,   349,   349,   349,   349,   349,   349,   349,   349,
     349,   349,   349,   349,   349,   375,    55,   -50,   349,   349,
     349,   349,   349,    57,   315,   315,   -50,   315,   -17,    -1,
     349,    82,    87,   118,   126,   131,   136,   140,   145,   175,
     379,   184,   189,   193,   392,   396,   197,   414,   349,   -50,
      50,    50,    52,    52,    52,   -50,   -50,    79,    60,   -50,
     315,   315,   315,   -50,   349,   349,   349,   349,   349,   -50,
     349,   319,   -50,   -50,   -50,   -50,   -50,   -50,   -50,   -50,
     -50,   349,   -50,   -50,   -50,   349,   349,   -50,   349,    -6,
     -50,   -50,    75,   -13,   255,   255,   255,   255,   255,   -50,
     -50,   202,   211,   241,   246,   113,   -50,   -50,   -50,   -50,
      89,   -50
  };

  const signed char
  DrParser::yydefact_[] =
  {
       0,     0,     0,     8,     0,     1,     0,    14,     9,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,    29,    30,
       0,     3,     4,     0,     0,     0,     2,    32,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     5,     0,     0,
       0,     0,     0,     0,     0,     0,    10,    11,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,    54,
      31,    33,    34,    35,    53,     7,    27,     0,     0,    12,
       0,     0,     0,    13,     0,     0,     0,     0,     0,    15,
      16,     0,    36,    37,    38,    39,    40,    41,    42,    43,
      44,     0,    46,    47,    48,     0,     0,    51,     0,     0,
      28,    24,    25,    26,    19,    21,    23,    20,    22,    17,
      18,     0,     0,     0,     0,     0,    45,    49,    50,    52,
       0,     6
  };

  const short
  DrParser::yypgoto_[] =
  {
     -50,   -50,   -50,   128,   -50,   -50,   -50,    91,   -50,   -50,
      51,   -50,   -49,    -4
  };

  const signed char
  DrParser::yydefgoto_[] =
  {
      -1,     2,     3,    31,    32,     7,     8,    66,    67,    36,
     109,   110,    68,    69
  };

  const unsigned char
  DrParser::yytable_[] =
  {
      33,    58,    59,    60,    61,    37,    58,    59,    60,    61,
     104,   105,   106,   107,   108,    96,    97,   100,   101,     1,
     102,   100,   101,    55,   102,   103,    56,    62,    33,     4,
       5,     6,    62,   145,    71,    72,    73,    74,    75,    76,
      77,    78,    79,    80,    81,    82,    83,    84,    85,    86,
      87,   131,   132,   133,    90,    91,    92,    93,    94,    60,
      61,    98,    58,    59,    60,    61,   111,    58,    59,    60,
      61,   104,   105,   106,   107,   108,    34,    35,    38,    70,
      39,    40,    41,    62,   129,    62,    42,    43,    62,    58,
      59,    60,    61,    62,    58,    59,    60,    61,    44,    95,
     134,   135,   136,   137,   138,    89,   111,    45,    46,   100,
      89,    47,    48,   100,   101,    62,   102,   141,    49,    50,
      62,   142,   143,    51,   144,    58,    59,    60,    61,   130,
      52,   151,   112,    58,    59,    60,    61,   113,    58,    59,
      60,    61,    53,    58,    59,    60,    61,    58,    59,    60,
      61,    62,    58,    59,    60,    61,    54,   150,    99,    62,
      57,   139,     0,     0,    62,     0,     0,     0,   114,    62,
       0,     0,     0,    62,     0,     0,   115,     0,    62,     0,
       0,   116,    58,    59,    60,    61,   117,     0,     0,     0,
     118,    58,    59,    60,    61,   119,    58,    59,    60,    61,
      58,    59,    60,    61,    58,    59,    60,    61,    62,    58,
      59,    60,    61,     0,     0,     0,     0,    62,    58,    59,
      60,    61,    62,     0,     0,   120,    62,     0,     0,     0,
      62,     0,     0,     0,   122,    62,     0,     0,     0,   123,
       0,     0,     0,   124,    62,     0,     0,   127,    58,    59,
      60,    61,   146,    58,    59,    60,    61,    58,    59,    60,
      61,   147,    58,    59,    60,    61,     0,     0,     0,     0,
       0,     0,     0,     0,    62,     0,     0,     0,     0,    62,
       0,     0,     0,    62,     0,     0,     0,     0,    62,     9,
       0,   148,     0,     0,    63,     0,   149,    10,    11,    12,
      13,    14,    15,    16,    17,    18,    19,    20,    21,    22,
      23,    24,    25,    26,     0,     0,     0,     0,     0,    27,
       0,     0,     0,     9,    28,    29,    58,    59,    60,    61,
      30,    10,    11,    12,    13,    14,    15,    16,    17,    18,
      19,    20,    21,    22,    23,    24,    25,    26,     0,     0,
       0,    64,    62,     0,     0,     0,     0,     9,    28,    29,
       0,   140,     0,     0,    65,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    58,    59,    60,    61,    58,    59,    60,    61,
       0,     0,    28,    29,     0,     0,     0,     0,    30,    58,
      59,    60,    61,    58,    59,    60,    61,     0,    62,     0,
       0,     0,    62,     0,     0,     0,    88,     0,     0,     0,
     121,    58,    59,    60,    61,    62,     0,     0,     0,    62,
       0,     0,     0,   125,     0,     0,     0,   126,     0,     0,
       0,     0,     0,     0,     0,     0,     0,    62,     0,     0,
       0,     0,     0,     0,     0,   128
  };

  const short
  DrParser::yycheck_[] =
  {
       4,     7,     8,     9,    10,     9,     7,     8,     9,    10,
      11,    12,    13,    14,    15,    64,    65,    34,    35,     3,
      37,    34,    35,    27,    37,    42,    30,    33,    32,    40,
       0,     6,    33,    39,    38,    39,    40,    41,    42,    43,
      44,    45,    46,    47,    48,    49,    50,    51,    52,    53,
      54,   100,   101,   102,    58,    59,    60,    61,    62,     9,
      10,    65,     7,     8,     9,    10,    70,     7,     8,     9,
      10,    11,    12,    13,    14,    15,    40,     4,    49,    40,
      49,    49,    49,    33,    88,    33,    49,    49,    33,     7,
       8,     9,    10,    33,     7,     8,     9,    10,    49,    42,
     104,   105,   106,   107,   108,    50,   110,    49,    49,    34,
      50,    49,    49,    34,    35,    33,    37,   121,    49,    49,
      33,   125,   126,    49,   128,     7,     8,     9,    10,    50,
      49,    42,    50,     7,     8,     9,    10,    50,     7,     8,
       9,    10,    49,     7,     8,     9,    10,     7,     8,     9,
      10,    33,     7,     8,     9,    10,    49,    44,    67,    33,
      32,   110,    -1,    -1,    33,    -1,    -1,    -1,    50,    33,
      -1,    -1,    -1,    33,    -1,    -1,    50,    -1,    33,    -1,
      -1,    50,     7,     8,     9,    10,    50,    -1,    -1,    -1,
      50,     7,     8,     9,    10,    50,     7,     8,     9,    10,
       7,     8,     9,    10,     7,     8,     9,    10,    33,     7,
       8,     9,    10,    -1,    -1,    -1,    -1,    33,     7,     8,
       9,    10,    33,    -1,    -1,    50,    33,    -1,    -1,    -1,
      33,    -1,    -1,    -1,    50,    33,    -1,    -1,    -1,    50,
      -1,    -1,    -1,    50,    33,    -1,    -1,    50,     7,     8,
       9,    10,    50,     7,     8,     9,    10,     7,     8,     9,
      10,    50,     7,     8,     9,    10,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    33,    -1,    -1,    -1,    -1,    33,
      -1,    -1,    -1,    33,    -1,    -1,    -1,    -1,    33,     8,
      -1,    50,    -1,    -1,    44,    -1,    50,    16,    17,    18,
      19,    20,    21,    22,    23,    24,    25,    26,    27,    28,
      29,    30,    31,    32,    -1,    -1,    -1,    -1,    -1,    38,
      -1,    -1,    -1,     8,    43,    44,     7,     8,     9,    10,
      49,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    -1,    -1,
      -1,    36,    33,    -1,    -1,    -1,    -1,     8,    43,    44,
      -1,    42,    -1,    -1,    49,    16,    17,    18,    19,    20,
      21,    22,    23,    24,    25,    26,    27,    28,    29,    30,
      31,    32,     7,     8,     9,    10,     7,     8,     9,    10,
      -1,    -1,    43,    44,    -1,    -1,    -1,    -1,    49,     7,
       8,     9,    10,     7,     8,     9,    10,    -1,    33,    -1,
      -1,    -1,    33,    -1,    -1,    -1,    41,    -1,    -1,    -1,
      41,     7,     8,     9,    10,    33,    -1,    -1,    -1,    33,
      -1,    -1,    -1,    41,    -1,    -1,    -1,    41,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    33,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    41
  };

  const signed char
  DrParser::yystos_[] =
  {
       0,     3,    52,    53,    40,     0,     6,    56,    57,     8,
      16,    17,    18,    19,    20,    21,    22,    23,    24,    25,
      26,    27,    28,    29,    30,    31,    32,    38,    43,    44,
      49,    54,    55,    64,    40,     4,    60,    64,    49,    49,
      49,    49,    49,    49,    49,    49,    49,    49,    49,    49,
      49,    49,    49,    49,    49,    64,    64,    54,     7,     8,
       9,    10,    33,    44,    36,    49,    58,    59,    63,    64,
      40,    64,    64,    64,    64,    64,    64,    64,    64,    64,
      64,    64,    64,    64,    64,    64,    64,    64,    41,    50,
      64,    64,    64,    64,    64,    42,    63,    63,    64,    58,
      34,    35,    37,    42,    11,    12,    13,    14,    15,    61,
      62,    64,    50,    50,    50,    50,    50,    50,    50,    50,
      50,    41,    50,    50,    50,    41,    41,    50,    41,    64,
      50,    63,    63,    63,    64,    64,    64,    64,    64,    61,
      42,    64,    64,    64,    64,    39,    50,    50,    50,    50,
      44,    42
  };

  const signed char
  DrParser::yyr1_[] =
  {
       0,    51,    52,    53,    54,    54,    55,    55,    56,    56,
      57,    58,    58,    59,    60,    60,    61,    61,    62,    63,
      63,    63,    63,    63,    63,    63,    63,    63,    63,    64,
      64,    64,    64,    64,    64,    64,    64,    64,    64,    64,
      64,    64,    64,    64,    64,    64,    64,    64,    64,    64,
      64,    64,    64,    64,    64
  };

  const signed char
  DrParser::yyr2_[] =
  {
       0,     2,     3,     3,     1,     2,     7,     3,     0,     1,
       3,     1,     2,     2,     0,     3,     1,     2,     2,     3,
       3,     3,     3,     3,     3,     3,     3,     2,     3,     1,
       1,     3,     2,     3,     3,     3,     4,     4,     4,     4,
       4,     4,     4,     4,     4,     6,     4,     4,     4,     6,
       6,     4,     6,     3,     3
  };



  // YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
  // First, the terminals, then, starting at \a yyntokens_, nonterminals.
  const char*
  const DrParser::yytname_[] =
  {
  "\"end of file\"", "error", "$undefined", "TK_VAR", "TK_COST",
  "TK_PREC", "TK_CTR", "TK_PLUS", "TK_MINUS", "TK_TIMES", "TK_DIV",
  "TK_EQ", "TK_LTE", "TK_GTE", "TK_LT", "TK_GT", "TK_EXP", "TK_LOG",
  "TK_ABS", "TK_SIN", "TK_COS", "TK_TAN", "TK_ASIN", "TK_ACOS", "TK_ATAN",
  "TK_ATAN2", "TK_SINH", "TK_COSH", "TK_TANH", "TK_MIN", "TK_MAX",
  "TK_SQRT", "TK_POW", "TK_CARET", "TK_AND", "TK_OR", "TK_NOT",
  "TK_IMPLIES", "TK_LB", "TK_RB", "TK_COLON", "TK_COMMA", "TK_SEMICOLON",
  "\"double\"", "\"identifier\"", "TK_NEQ", "TK_LEQ", "TK_GEQ", "UMINUS",
  "'('", "')'", "$accept", "script", "var_decl_sec", "var_decl_list",
  "var_decl", "opt_ctr_decl_sec", "ctr_decl_sec", "ctr_decl_list",
  "ctr_decl", "opt_cost_decl_sec", "cost_decl_list", "cost_decl",
  "formula", "expr", YY_NULLPTR
  };

#if DREALDEBUG
  const unsigned char
  DrParser::yyrline_[] =
  {
       0,   104,   104,   115,   118,   119,   122,   125,   133,   134,
     137,   140,   141,   144,   152,   153,   156,   157,   160,   169,
     170,   171,   172,   173,   174,   175,   176,   177,   178,   184,
     185,   194,   195,   196,   197,   198,   199,   200,   201,   202,
     203,   204,   205,   206,   207,   208,   209,   210,   211,   212,
     213,   214,   215,   216,   217
  };

  // Print the state stack on the debug stream.
  void
  DrParser::yystack_print_ ()
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
  DrParser::yy_reduce_print_ (int yyrule)
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

  DrParser::token_number_type
  DrParser::yytranslate_ (int t)
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
      49,    50,     2,     2,     2,     2,     2,     2,     2,     2,
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
      45,    46,    47,    48
    };
    const int user_token_number_max_ = 303;

    if (t <= 0)
      return yyeof_;
    else if (t <= user_token_number_max_)
      return translate_table[t];
    else
      return yy_undef_token_;
  }

} // dreal
#line 1680 "bazel-out/k8-opt/bin/dreal/dr/parser.yy.cc"

#line 220 "dreal/dr/parser.yy"
 /*** Additional Code ***/
void dreal::DrParser::error(const DrParser::location_type& l,
                            const std::string& m) {
    driver.error(l, m);
}

#ifdef __clang__
#pragma clang diagnostic pop
#endif
#pragma GCC diagnostic pop

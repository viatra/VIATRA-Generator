one sig util'language {
	AsDeclaration'pattern'queries'directParent : type'Commit'class->type'Commit'class,
	util'root : one type'PullRequest'class + (type'IssueEvent'class + (type'Commit'class + (type'User'class + (type'Project'class + (type'Issue'class + (type'Project'class'DefinedPart + type'Project'class'UndefinedPart)))))),
	util'contains : (type'PullRequest'class + (type'IssueEvent'class + (type'Commit'class + (type'User'class + (type'Project'class + (type'Issue'class + (type'Project'class'DefinedPart + type'Project'class'UndefinedPart))))))) lone->set (type'PullRequest'class + (type'IssueEvent'class + (type'Commit'class + (type'User'class + (type'Project'class + (type'Issue'class + (type'Project'class'DefinedPart + type'Project'class'UndefinedPart)))))))
}
abstract sig util'Object {
}
sig type'User'class extends util'Object {
}
abstract sig type'Project'class extends util'Object {
	issue'reference'Project : set type'Issue'class,
	projectMembers'reference'Project : set type'User'class,
	commits'reference'Project : set type'Commit'class
}
sig type'Commit'class extends util'Object {
	committer'reference'Commit : one type'User'class,
	parents'reference'Commit : set type'Commit'class,
	pullrequest'reference'Commit : lone type'PullRequest'class
}
sig type'Issue'class extends util'Object {
	pullrequest'reference'Issue : lone type'PullRequest'class,
	issueevent'reference'Issue : set type'IssueEvent'class
}
sig type'PullRequest'class extends util'Object {
	commit'reference'PullRequest : lone type'Commit'class
}
sig type'IssueEvent'class extends util'Object {
	user'reference'IssueEvent : one type'User'class,
	action'attribute'IssueEvent : one type'Action'enum
}
abstract sig type'Action'enum extends util'Object {
}
abstract sig type'Project'class'DefinedPart extends type'Project'class {
}
sig type'Project'class'UndefinedPart extends type'Project'class {
}
one sig element'SUBSCRIBED'literal'Action extends type'Action'enum {
}
one sig element'MENTIONED'literal'Action extends type'Action'enum {
}
one sig element'CLOSED'literal'Action extends type'Action'enum {
}
one sig element'REFERENCED'literal'Action extends type'Action'enum {
}
one sig element'ASSIGNED'literal'Action extends type'Action'enum {
}
one sig element'REOPENED'literal'Action extends type'Action'enum {
}
one sig element'UNSUBSCRIBED'literal'Action extends type'Action'enum {
}
one sig element'MERGED'literal'Action extends type'Action'enum {
}
one sig element'HEAD_REF_CLEANED'literal'Action extends type'Action'enum {
}
one sig element'HEAD_REF_DELETED'literal'Action extends type'Action'enum {
}
one sig element'HEAD_REF_RESTORED'literal'Action extends type'Action'enum {
}
one sig element'o'1 extends type'Project'class'DefinedPart {
}
pred pattern'queries'directParent [parameter'a: type'Commit'class, parameter'b: type'Commit'class] {
	parameter'b in parameter'a.parents'reference'Commit && parameter'b in type'Commit'class
}
pred pattern'queries'loopInParent [parameter'a: type'Commit'class] {
	parameter'a->parameter'a in ^ (util'language.AsDeclaration'pattern'queries'directParent)
}
pred pattern'queries'checkAction [parameter'i: type'Issue'class, parameter'e: type'IssueEvent'class, parameter't: type'Action'enum] {
	parameter'e in parameter'i.issueevent'reference'Issue && parameter't in parameter'e.action'attribute'IssueEvent
}
pred pattern'queries'checkUserAction [parameter'i: type'Issue'class, parameter'u: type'User'class, parameter'e: type'IssueEvent'class, parameter't: type'Action'enum] {
	parameter'e in parameter'i.issueevent'reference'Issue && (parameter'u in parameter'e.user'reference'IssueEvent && (parameter'u in type'User'class && parameter't in parameter'e.action'attribute'IssueEvent))
}
pred pattern'queries'isReopen [parameter'i: type'Issue'class, parameter'e: type'IssueEvent'class] {
	some variable'a: type'Action'enum { parameter'e in parameter'i.issueevent'reference'Issue && (variable'a in parameter'e.action'attribute'IssueEvent && variable'a = element'REOPENED'literal'Action) }
}
pred pattern'queries'isClose [parameter'i: type'Issue'class, parameter'e: type'IssueEvent'class] {
	some variable'a: type'Action'enum { parameter'e in parameter'i.issueevent'reference'Issue && (variable'a in parameter'e.action'attribute'IssueEvent && variable'a = element'CLOSED'literal'Action) }
}
pred pattern'queries'isUnSubscribe [parameter'i: type'Issue'class, parameter'u: type'User'class, parameter'e: type'IssueEvent'class] {
	some variable'a: type'Action'enum { parameter'e in parameter'i.issueevent'reference'Issue && (parameter'u in parameter'e.user'reference'IssueEvent && (parameter'u in type'User'class && (variable'a in parameter'e.action'attribute'IssueEvent && variable'a = element'UNSUBSCRIBED'literal'Action))) }
}
pred pattern'queries'isSubscribe [parameter'i: type'Issue'class, parameter'u: type'User'class, parameter'e: type'IssueEvent'class] {
	some variable'a: type'Action'enum { parameter'e in parameter'i.issueevent'reference'Issue && (parameter'u in parameter'e.user'reference'IssueEvent && (parameter'u in type'User'class && (variable'a in parameter'e.action'attribute'IssueEvent && variable'a = element'SUBSCRIBED'literal'Action))) }
}
pred pattern'queries'consecutiveClosesWithoutReopen [parameter'i: type'Issue'class] {
	some variable'a1: type'IssueEvent'class, variable'a2: type'IssueEvent'class, variable'virtual0: type'Action'enum, variable'virtual1: type'Action'enum { all variable'0: type'IssueEvent'class { variable'virtual0 = element'CLOSED'literal'Action && (pattern'queries'checkAction [ parameter'i , variable'a1 , variable'virtual0 ] && (variable'virtual1 = element'CLOSED'literal'Action && (pattern'queries'checkAction [ parameter'i , variable'a2 , variable'virtual1 ] && (variable'a1 != variable'a2 && not (pattern'queries'isReopen [ parameter'i , variable'0 ]))))) } }
}
pred pattern'queries'consecutiveReopensWithoutClose [parameter'i: type'Issue'class] {
	some variable'a1: type'IssueEvent'class, variable'a2: type'IssueEvent'class, variable'virtual0: type'Action'enum, variable'virtual1: type'Action'enum { all variable'0: type'IssueEvent'class { variable'virtual0 = element'REOPENED'literal'Action && (pattern'queries'checkAction [ parameter'i , variable'a1 , variable'virtual0 ] && (variable'virtual1 = element'REOPENED'literal'Action && (pattern'queries'checkAction [ parameter'i , variable'a2 , variable'virtual1 ] && (variable'a1 != variable'a2 && not (pattern'queries'isClose [ parameter'i , variable'0 ]))))) } }
}
pred pattern'queries'consecutiveSubWithoutUnSub [parameter'i: type'Issue'class, parameter'u: type'User'class] {
	some variable'a1: type'IssueEvent'class, variable'a2: type'IssueEvent'class, variable'virtual0: type'Action'enum, variable'virtual1: type'Action'enum { all variable'0: type'IssueEvent'class { variable'virtual0 = element'SUBSCRIBED'literal'Action && (pattern'queries'checkUserAction [ parameter'i , parameter'u , variable'a1 , variable'virtual0 ] && (variable'virtual1 = element'SUBSCRIBED'literal'Action && (pattern'queries'checkUserAction [ parameter'i , parameter'u , variable'a2 , variable'virtual1 ] && (variable'a1 != variable'a2 && not (pattern'queries'isUnSubscribe [ parameter'i , parameter'u , variable'0 ]))))) } }
}
pred pattern'queries'consecutiveUnSubWithoutSub [parameter'i: type'Issue'class, parameter'u: type'User'class] {
	some variable'a1: type'IssueEvent'class, variable'a2: type'IssueEvent'class, variable'virtual0: type'Action'enum, variable'virtual1: type'Action'enum { all variable'0: type'IssueEvent'class { variable'virtual0 = element'UNSUBSCRIBED'literal'Action && (pattern'queries'checkUserAction [ parameter'i , parameter'u , variable'a1 , variable'virtual0 ] && (variable'virtual1 = element'UNSUBSCRIBED'literal'Action && (pattern'queries'checkUserAction [ parameter'i , parameter'u , variable'a2 , variable'virtual1 ] && (variable'a1 != variable'a2 && not (pattern'queries'isSubscribe [ parameter'i , parameter'u , variable'0 ]))))) } }
}
pred pattern'queries'committer [parameter'c: type'Commit'class, parameter'u: type'User'class] {
	parameter'u in parameter'c.committer'reference'Commit && parameter'u in type'User'class
}
pred pattern'queries'eventUser [parameter'e: type'IssueEvent'class, parameter'u: type'User'class] {
	parameter'u in parameter'e.user'reference'IssueEvent && parameter'u in type'User'class
}
pred pattern'queries'noCommitter [parameter'c: type'Commit'class] {
	all variable'0: type'User'class { parameter'c in type'Commit'class && not (pattern'queries'committer [ parameter'c , variable'0 ]) }
}
pred pattern'queries'noUser [parameter'e: type'IssueEvent'class] {
	all variable'0: type'User'class { parameter'e in type'IssueEvent'class && not (pattern'queries'eventUser [ parameter'e , variable'0 ]) }
}
fact EqualsAsDeclaration'pattern'queries'directParent {
	all a: type'Commit'class, b: type'Commit'class { pattern'queries'directParent [ a , b ] <=> a->b in util'language.AsDeclaration'pattern'queries'directParent }
}
fact util'containmentDefinition {
	util'language.util'contains = issue'reference'Project + (projectMembers'reference'Project + (commits'reference'Project + (pullrequest'reference'Issue + issueevent'reference'Issue)))
}
fact util'noParentForRoot {
	no parent: type'PullRequest'class + (type'IssueEvent'class + (type'Commit'class + (type'User'class + (type'Project'class + (type'Issue'class + (type'Project'class'DefinedPart + type'Project'class'UndefinedPart)))))) { parent->(util'language.util'root) in util'language.util'contains }
}
fact util'atLeastOneParent {
	all child: type'PullRequest'class + (type'IssueEvent'class + (type'Commit'class + (type'User'class + (type'Project'class + (type'Issue'class + (type'Project'class'DefinedPart + type'Project'class'UndefinedPart)))))) { child = util'language.util'root or (some parent: type'PullRequest'class + (type'IssueEvent'class + (type'Commit'class + (type'User'class + (type'Project'class + (type'Issue'class + (type'Project'class'DefinedPart + type'Project'class'UndefinedPart)))))) { parent->child in util'language.util'contains }) }
}
fact util'noCircularContainment {
	no circle: type'PullRequest'class + (type'IssueEvent'class + (type'Commit'class + (type'User'class + (type'Project'class + (type'Issue'class + (type'Project'class'DefinedPart + type'Project'class'UndefinedPart)))))) { circle->circle in ^ (util'language.util'contains) }
}
fact upperMultiplicity'parents'Commit {
	all src: type'Commit'class, trg'1: type'Commit'class, trg'2: type'Commit'class, trg'3: type'Commit'class { trg'1 in src.parents'reference'Commit && (trg'2 in src.parents'reference'Commit && trg'3 in src.parents'reference'Commit) => not (trg'1 != trg'2 && (trg'1 != trg'3 && trg'2 != trg'3)) }
}
fact oppositeReference'pullrequest'Commit {
	pullrequest'reference'Commit = ~ commit'reference'PullRequest
}
fact errorpattern'queries'loopInParent {
	all p0: type'Commit'class { not (pattern'queries'loopInParent [ p0 ]) }
}
fact errorpattern'queries'consecutiveClosesWithoutReopen {
	all p0: type'Issue'class { not (pattern'queries'consecutiveClosesWithoutReopen [ p0 ]) }
}
fact errorpattern'queries'consecutiveReopensWithoutClose {
	all p0: type'Issue'class { not (pattern'queries'consecutiveReopensWithoutClose [ p0 ]) }
}
fact errorpattern'queries'consecutiveSubWithoutUnSub {
	all p0: type'Issue'class, p1: type'User'class { not (pattern'queries'consecutiveSubWithoutUnSub [ p0 , p1 ]) }
}
fact errorpattern'queries'consecutiveUnSubWithoutSub {
	all p0: type'Issue'class, p1: type'User'class { not (pattern'queries'consecutiveUnSubWithoutSub [ p0 , p1 ]) }
}
fact errorpattern'queries'noCommitter {
	all p0: type'Commit'class { not (pattern'queries'noCommitter [ p0 ]) }
}
fact errorpattern'queries'noUser {
	all p0: type'IssueEvent'class { not (pattern'queries'noUser [ p0 ]) }
}
run { } for exactly 41 util'Object , 1 Int , exactly 0 String
/**
 * Generated from platform:/resource/case.study.a.queries/src/queries/case_study_A.vql
 */
package queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import queries.Inv03;
import queries.Inv05;
import queries.Inv06;
import queries.Inv07;
import queries.Inv08;
import queries.Inv10;
import queries.Inv11;
import queries.Inv12;
import queries.Inv13;
import queries.Inv15;
import queries.Inv17;
import queries.Inv20;
import queries.Inv33;
import queries.Inv34;
import queries.Inv35;
import queries.Inv47;
import queries.Inv48;
import queries.Inv49;
import queries.X_inv03_eligAll;
import queries.X_inv03_hasAll;
import queries.X_inv05_inRange;
import queries.X_inv08_inRange;
import queries.X_inv08_noType;
import queries.X_inv08_notEI;
import queries.X_inv11_incNotOver100;
import queries.X_inv11_incOver100;
import queries.X_inv12_notNonRes;
import queries.X_inv12_notZZ;
import queries.X_inv13;
import queries.X_inv15;
import queries.X_inv47;
import queries.X_inv48_3;
import queries.X_inv48_Dis;
import queries.X_inv48_notDis;
import queries.X_inv49_1;
import queries.X_inv49_2;

/**
 * A pattern group formed of all public patterns defined in case_study_A.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file case_study_A.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package queries, the group contains the definition of the following patterns: <ul>
 * <li>inv03</li>
 * <li>x_inv03_eligAll</li>
 * <li>x_inv03_hasAll</li>
 * <li>inv05</li>
 * <li>x_inv05_inRange</li>
 * <li>inv06</li>
 * <li>inv07</li>
 * <li>inv08</li>
 * <li>x_inv08_notEI</li>
 * <li>x_inv08_noType</li>
 * <li>x_inv08_inRange</li>
 * <li>inv10</li>
 * <li>inv11</li>
 * <li>x_inv11_incOver100</li>
 * <li>x_inv11_incNotOver100</li>
 * <li>inv12</li>
 * <li>x_inv12_notNonRes</li>
 * <li>x_inv12_notZZ</li>
 * <li>inv13</li>
 * <li>x_inv13</li>
 * <li>inv15</li>
 * <li>x_inv15</li>
 * <li>inv17</li>
 * <li>inv20</li>
 * <li>inv33</li>
 * <li>inv34</li>
 * <li>inv35</li>
 * <li>inv47</li>
 * <li>x_inv47</li>
 * <li>inv48</li>
 * <li>x_inv48_notDis</li>
 * <li>x_inv48_Dis</li>
 * <li>x_inv48_3</li>
 * <li>inv49</li>
 * <li>x_inv49_1</li>
 * <li>x_inv49_2</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class Case_study_A extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Case_study_A instance() {
    if (INSTANCE == null) {
        INSTANCE = new Case_study_A();
    }
    return INSTANCE;
  }
  
  private static Case_study_A INSTANCE;
  
  private Case_study_A() {
    querySpecifications.add(Inv03.instance());
    querySpecifications.add(X_inv03_eligAll.instance());
    querySpecifications.add(X_inv03_hasAll.instance());
    querySpecifications.add(Inv05.instance());
    querySpecifications.add(X_inv05_inRange.instance());
    querySpecifications.add(Inv06.instance());
    querySpecifications.add(Inv07.instance());
    querySpecifications.add(Inv08.instance());
    querySpecifications.add(X_inv08_notEI.instance());
    querySpecifications.add(X_inv08_noType.instance());
    querySpecifications.add(X_inv08_inRange.instance());
    querySpecifications.add(Inv10.instance());
    querySpecifications.add(Inv11.instance());
    querySpecifications.add(X_inv11_incOver100.instance());
    querySpecifications.add(X_inv11_incNotOver100.instance());
    querySpecifications.add(Inv12.instance());
    querySpecifications.add(X_inv12_notNonRes.instance());
    querySpecifications.add(X_inv12_notZZ.instance());
    querySpecifications.add(Inv13.instance());
    querySpecifications.add(X_inv13.instance());
    querySpecifications.add(Inv15.instance());
    querySpecifications.add(X_inv15.instance());
    querySpecifications.add(Inv17.instance());
    querySpecifications.add(Inv20.instance());
    querySpecifications.add(Inv33.instance());
    querySpecifications.add(Inv34.instance());
    querySpecifications.add(Inv35.instance());
    querySpecifications.add(Inv47.instance());
    querySpecifications.add(X_inv47.instance());
    querySpecifications.add(Inv48.instance());
    querySpecifications.add(X_inv48_notDis.instance());
    querySpecifications.add(X_inv48_Dis.instance());
    querySpecifications.add(X_inv48_3.instance());
    querySpecifications.add(Inv49.instance());
    querySpecifications.add(X_inv49_1.instance());
    querySpecifications.add(X_inv49_2.instance());
  }
  
  public Inv03 getInv03() {
    return Inv03.instance();
  }
  
  public Inv03.Matcher getInv03(final ViatraQueryEngine engine) {
    return Inv03.Matcher.on(engine);
  }
  
  public X_inv03_eligAll getX_inv03_eligAll() {
    return X_inv03_eligAll.instance();
  }
  
  public X_inv03_eligAll.Matcher getX_inv03_eligAll(final ViatraQueryEngine engine) {
    return X_inv03_eligAll.Matcher.on(engine);
  }
  
  public X_inv03_hasAll getX_inv03_hasAll() {
    return X_inv03_hasAll.instance();
  }
  
  public X_inv03_hasAll.Matcher getX_inv03_hasAll(final ViatraQueryEngine engine) {
    return X_inv03_hasAll.Matcher.on(engine);
  }
  
  public Inv05 getInv05() {
    return Inv05.instance();
  }
  
  public Inv05.Matcher getInv05(final ViatraQueryEngine engine) {
    return Inv05.Matcher.on(engine);
  }
  
  public X_inv05_inRange getX_inv05_inRange() {
    return X_inv05_inRange.instance();
  }
  
  public X_inv05_inRange.Matcher getX_inv05_inRange(final ViatraQueryEngine engine) {
    return X_inv05_inRange.Matcher.on(engine);
  }
  
  public Inv06 getInv06() {
    return Inv06.instance();
  }
  
  public Inv06.Matcher getInv06(final ViatraQueryEngine engine) {
    return Inv06.Matcher.on(engine);
  }
  
  public Inv07 getInv07() {
    return Inv07.instance();
  }
  
  public Inv07.Matcher getInv07(final ViatraQueryEngine engine) {
    return Inv07.Matcher.on(engine);
  }
  
  public Inv08 getInv08() {
    return Inv08.instance();
  }
  
  public Inv08.Matcher getInv08(final ViatraQueryEngine engine) {
    return Inv08.Matcher.on(engine);
  }
  
  public X_inv08_notEI getX_inv08_notEI() {
    return X_inv08_notEI.instance();
  }
  
  public X_inv08_notEI.Matcher getX_inv08_notEI(final ViatraQueryEngine engine) {
    return X_inv08_notEI.Matcher.on(engine);
  }
  
  public X_inv08_noType getX_inv08_noType() {
    return X_inv08_noType.instance();
  }
  
  public X_inv08_noType.Matcher getX_inv08_noType(final ViatraQueryEngine engine) {
    return X_inv08_noType.Matcher.on(engine);
  }
  
  public X_inv08_inRange getX_inv08_inRange() {
    return X_inv08_inRange.instance();
  }
  
  public X_inv08_inRange.Matcher getX_inv08_inRange(final ViatraQueryEngine engine) {
    return X_inv08_inRange.Matcher.on(engine);
  }
  
  public Inv10 getInv10() {
    return Inv10.instance();
  }
  
  public Inv10.Matcher getInv10(final ViatraQueryEngine engine) {
    return Inv10.Matcher.on(engine);
  }
  
  public Inv11 getInv11() {
    return Inv11.instance();
  }
  
  public Inv11.Matcher getInv11(final ViatraQueryEngine engine) {
    return Inv11.Matcher.on(engine);
  }
  
  public X_inv11_incOver100 getX_inv11_incOver100() {
    return X_inv11_incOver100.instance();
  }
  
  public X_inv11_incOver100.Matcher getX_inv11_incOver100(final ViatraQueryEngine engine) {
    return X_inv11_incOver100.Matcher.on(engine);
  }
  
  public X_inv11_incNotOver100 getX_inv11_incNotOver100() {
    return X_inv11_incNotOver100.instance();
  }
  
  public X_inv11_incNotOver100.Matcher getX_inv11_incNotOver100(final ViatraQueryEngine engine) {
    return X_inv11_incNotOver100.Matcher.on(engine);
  }
  
  public Inv12 getInv12() {
    return Inv12.instance();
  }
  
  public Inv12.Matcher getInv12(final ViatraQueryEngine engine) {
    return Inv12.Matcher.on(engine);
  }
  
  public X_inv12_notNonRes getX_inv12_notNonRes() {
    return X_inv12_notNonRes.instance();
  }
  
  public X_inv12_notNonRes.Matcher getX_inv12_notNonRes(final ViatraQueryEngine engine) {
    return X_inv12_notNonRes.Matcher.on(engine);
  }
  
  public X_inv12_notZZ getX_inv12_notZZ() {
    return X_inv12_notZZ.instance();
  }
  
  public X_inv12_notZZ.Matcher getX_inv12_notZZ(final ViatraQueryEngine engine) {
    return X_inv12_notZZ.Matcher.on(engine);
  }
  
  public Inv13 getInv13() {
    return Inv13.instance();
  }
  
  public Inv13.Matcher getInv13(final ViatraQueryEngine engine) {
    return Inv13.Matcher.on(engine);
  }
  
  public X_inv13 getX_inv13() {
    return X_inv13.instance();
  }
  
  public X_inv13.Matcher getX_inv13(final ViatraQueryEngine engine) {
    return X_inv13.Matcher.on(engine);
  }
  
  public Inv15 getInv15() {
    return Inv15.instance();
  }
  
  public Inv15.Matcher getInv15(final ViatraQueryEngine engine) {
    return Inv15.Matcher.on(engine);
  }
  
  public X_inv15 getX_inv15() {
    return X_inv15.instance();
  }
  
  public X_inv15.Matcher getX_inv15(final ViatraQueryEngine engine) {
    return X_inv15.Matcher.on(engine);
  }
  
  public Inv17 getInv17() {
    return Inv17.instance();
  }
  
  public Inv17.Matcher getInv17(final ViatraQueryEngine engine) {
    return Inv17.Matcher.on(engine);
  }
  
  public Inv20 getInv20() {
    return Inv20.instance();
  }
  
  public Inv20.Matcher getInv20(final ViatraQueryEngine engine) {
    return Inv20.Matcher.on(engine);
  }
  
  public Inv33 getInv33() {
    return Inv33.instance();
  }
  
  public Inv33.Matcher getInv33(final ViatraQueryEngine engine) {
    return Inv33.Matcher.on(engine);
  }
  
  public Inv34 getInv34() {
    return Inv34.instance();
  }
  
  public Inv34.Matcher getInv34(final ViatraQueryEngine engine) {
    return Inv34.Matcher.on(engine);
  }
  
  public Inv35 getInv35() {
    return Inv35.instance();
  }
  
  public Inv35.Matcher getInv35(final ViatraQueryEngine engine) {
    return Inv35.Matcher.on(engine);
  }
  
  public Inv47 getInv47() {
    return Inv47.instance();
  }
  
  public Inv47.Matcher getInv47(final ViatraQueryEngine engine) {
    return Inv47.Matcher.on(engine);
  }
  
  public X_inv47 getX_inv47() {
    return X_inv47.instance();
  }
  
  public X_inv47.Matcher getX_inv47(final ViatraQueryEngine engine) {
    return X_inv47.Matcher.on(engine);
  }
  
  public Inv48 getInv48() {
    return Inv48.instance();
  }
  
  public Inv48.Matcher getInv48(final ViatraQueryEngine engine) {
    return Inv48.Matcher.on(engine);
  }
  
  public X_inv48_notDis getX_inv48_notDis() {
    return X_inv48_notDis.instance();
  }
  
  public X_inv48_notDis.Matcher getX_inv48_notDis(final ViatraQueryEngine engine) {
    return X_inv48_notDis.Matcher.on(engine);
  }
  
  public X_inv48_Dis getX_inv48_Dis() {
    return X_inv48_Dis.instance();
  }
  
  public X_inv48_Dis.Matcher getX_inv48_Dis(final ViatraQueryEngine engine) {
    return X_inv48_Dis.Matcher.on(engine);
  }
  
  public X_inv48_3 getX_inv48_3() {
    return X_inv48_3.instance();
  }
  
  public X_inv48_3.Matcher getX_inv48_3(final ViatraQueryEngine engine) {
    return X_inv48_3.Matcher.on(engine);
  }
  
  public Inv49 getInv49() {
    return Inv49.instance();
  }
  
  public Inv49.Matcher getInv49(final ViatraQueryEngine engine) {
    return Inv49.Matcher.on(engine);
  }
  
  public X_inv49_1 getX_inv49_1() {
    return X_inv49_1.instance();
  }
  
  public X_inv49_1.Matcher getX_inv49_1(final ViatraQueryEngine engine) {
    return X_inv49_1.Matcher.on(engine);
  }
  
  public X_inv49_2 getX_inv49_2() {
    return X_inv49_2.instance();
  }
  
  public X_inv49_2.Matcher getX_inv49_2(final ViatraQueryEngine engine) {
    return X_inv49_2.Matcher.on(engine);
  }
}

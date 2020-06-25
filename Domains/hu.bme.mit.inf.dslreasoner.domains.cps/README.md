# Cyber Physical System case study for VIATRA Solver

## Modifications to the metamodel

* Removed the `State` enumeration and the `ApplicationInstance.state` attribute, as we are only optimizing static configurations of applications instead of deployment strategies.
* Added `ApplicationInstance.requirement` as an opposite reference of `Requirement.instances` with multiplicity `[1..1]` to ensure that each `ApplicationInstance` satisfies exactly one `Requirement`.
* Marked `HostInstance.availableMemory`, `availableHdd`, `totalMemory`, `totalHdd` as derived. The values of `availableMemory` and `availableHdd` can be computed from `totalMemory`, `totalHdd` and the `ResourceRequirement`s associated with the `ApplicationInstances` allocated to the `HostInstance`, while `totalMemory` and `totalHdd` are always equal to `HostType.defaultMemory` and `defaultHdd`.
cmake_minimum_required(VERSION 3.10.2)
project(hu.bme.mit.inf.dslreasoner.ilp.cbc)

set(CMAKE_CXX_STANDARD 14)

find_package(JNI REQUIRED)
find_package(PkgConfig REQUIRED)

pkg_check_modules(CBC REQUIRED cbc)

add_library(viatracbc SHARED viatracbc.cpp)

target_link_libraries(viatracbc
    ${JAVA_JVM_LIBRARY}
    ${CBC_LIBRARIES})
target_include_directories(viatracbc
    PUBLIC ${JNI_INCLUDE_DIRS}
    PRIVATE ${CBC_INCLUDE_DIRS})

set(VIATRACBC_NATIVES_DIR ${CMAKE_SOURCE_DIR}/../lib)
add_custom_command(TARGET viatracbc POST_BUILD
    COMMAND ${CMAKE_COMMAND} -E make_directory ${VIATRACBC_NATIVES_DIR}
    COMMAND ${CMAKE_COMMAND} -E copy $<TARGET_FILE:viatracbc> ${VIATRACBC_NATIVES_DIR})

Training run: ${PREMAIN_JDK}/bin/java -XX:+UnlockDiagnosticVMOptions -XX:+CDSManualFinalImage -XX:CacheDataStore=app.cds -cp classes/test.jar org.main.IndyTest
Assembly run: ${PREMAIN_JDK}/bin/java -cp classes/test.jar -XX:CacheDataStore=app.cds -XX:CDSPreimage=app.cds.preimage

Assembly run crashes with this assertion failure:

#  Internal Error (/home/asmehra/data/ashu-mehra/leyden/src/hotspot/share/classfile/javaClasses.inline.hpp:60), pid=1744183, tid=1744184
#  assert(is_instance(java_string)) failed: must be java_strin

Assertion failure masks the original problem which is NPE thrown by jdk/internal/constant/PrimitiveClassDescImpl.<clinit>
To see exception messages run the assembly run again with -Xlog:exceptions=trace:

${PREMAIN_JDK}/bin/java -Xlog:exceptions=trace -cp classes/test.jar -XX:CacheDataStore=app.cds -XX:CDSPreimage=app.cds.preimage

// CheckStyle: stop header check
// CheckStyle: stop line length check
// GENERATED CONTENT - DO NOT EDIT
// GENERATORS: org.graalvm.compiler.replacements.processor.ReplacementsAnnotationProcessor, org.graalvm.compiler.replacements.processor.PluginGenerator
package org.graalvm.compiler.hotspot.nodes;

import jdk.vm.ci.meta.ResolvedJavaMethod;

import java.lang.annotation.Annotation;
import org.graalvm.compiler.nodes.ValueNode;
import org.graalvm.compiler.nodes.graphbuilderconf.GraphBuilderContext;
import org.graalvm.compiler.nodes.graphbuilderconf.GeneratedInvocationPlugin;
import org.graalvm.compiler.nodes.graphbuilderconf.InvocationPlugin;
import org.graalvm.compiler.nodes.graphbuilderconf.InvocationPlugins;
import org.graalvm.compiler.nodes.graphbuilderconf.NodeIntrinsicPluginFactory;

import jdk.vm.ci.meta.JavaKind;

public class PluginFactory_BeginLockScopeNode implements NodeIntrinsicPluginFactory {

    //        class: org.graalvm.compiler.hotspot.nodes.BeginLockScopeNode
    //       method: beginLockScope(int)
    // generated-by: org.graalvm.compiler.replacements.processor.GeneratedNodeIntrinsicPlugin$ConstructorPlugin
    private static final class BeginLockScopeNode_beginLockScope extends GeneratedInvocationPlugin {

        @Override
        public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
            org.graalvm.compiler.word.WordTypes arg0 = injectedWordTypes;
            int arg1;
            if (args[0].isConstant()) {
                arg1 = args[0].asJavaConstant().asInt();
            } else {
                assert b.canDeferPlugin(this) : b.getClass().toString();
                return false;
            }
            org.graalvm.compiler.hotspot.nodes.BeginLockScopeNode node = new org.graalvm.compiler.hotspot.nodes.BeginLockScopeNode(arg0, arg1);
            b.addPush(JavaKind.Object, node);
            return true;
        }
        @Override
        public Class<? extends Annotation> getSource() {
            return org.graalvm.compiler.graph.Node.NodeIntrinsic.class;
        }

        private final org.graalvm.compiler.word.WordTypes injectedWordTypes;

        private BeginLockScopeNode_beginLockScope(InjectionProvider injection) {
            this.injectedWordTypes = injection.getInjectedArgument(org.graalvm.compiler.word.WordTypes.class);
        }
    }

    @Override
    public void registerPlugins(InvocationPlugins plugins, InjectionProvider injection) {
        plugins.register(new BeginLockScopeNode_beginLockScope(injection), org.graalvm.compiler.hotspot.nodes.BeginLockScopeNode.class, "beginLockScope", int.class);
    }
}

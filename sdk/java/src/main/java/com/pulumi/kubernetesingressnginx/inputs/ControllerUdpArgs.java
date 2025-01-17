// *** WARNING: this file was generated by pulumi-language-java. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetesingressnginx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ControllerUdpArgs extends com.pulumi.resources.ResourceArgs {

    public static final ControllerUdpArgs Empty = new ControllerUdpArgs();

    /**
     * Annotations to be added to the udp config configmap.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations to be added to the udp config configmap.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    @Import(name="configMapNamespace")
    private @Nullable Output<String> configMapNamespace;

    public Optional<Output<String>> configMapNamespace() {
        return Optional.ofNullable(this.configMapNamespace);
    }

    private ControllerUdpArgs() {}

    private ControllerUdpArgs(ControllerUdpArgs $) {
        this.annotations = $.annotations;
        this.configMapNamespace = $.configMapNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ControllerUdpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ControllerUdpArgs $;

        public Builder() {
            $ = new ControllerUdpArgs();
        }

        public Builder(ControllerUdpArgs defaults) {
            $ = new ControllerUdpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations to be added to the udp config configmap.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations to be added to the udp config configmap.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder configMapNamespace(@Nullable Output<String> configMapNamespace) {
            $.configMapNamespace = configMapNamespace;
            return this;
        }

        public Builder configMapNamespace(String configMapNamespace) {
            return configMapNamespace(Output.of(configMapNamespace));
        }

        public ControllerUdpArgs build() {
            return $;
        }
    }

}

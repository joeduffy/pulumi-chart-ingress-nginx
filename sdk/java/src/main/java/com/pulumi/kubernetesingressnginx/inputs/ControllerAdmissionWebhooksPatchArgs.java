// *** WARNING: this file was generated by pulumi-language-java. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetesingressnginx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.TolerationArgs;
import com.pulumi.kubernetesingressnginx.inputs.ControllerImageArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ControllerAdmissionWebhooksPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final ControllerAdmissionWebhooksPatchArgs Empty = new ControllerAdmissionWebhooksPatchArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="image")
    private @Nullable Output<ControllerImageArgs> image;

    public Optional<Output<ControllerImageArgs>> image() {
        return Optional.ofNullable(this.image);
    }

    @Import(name="nodeSelector")
    private @Nullable Output<Map<String,String>> nodeSelector;

    public Optional<Output<Map<String,String>>> nodeSelector() {
        return Optional.ofNullable(this.nodeSelector);
    }

    @Import(name="podAnnotations")
    private @Nullable Output<Map<String,String>> podAnnotations;

    public Optional<Output<Map<String,String>>> podAnnotations() {
        return Optional.ofNullable(this.podAnnotations);
    }

    /**
     * Provide a priority class name to the webhook patching job.
     * 
     */
    @Import(name="priorityClassName")
    private @Nullable Output<String> priorityClassName;

    /**
     * @return Provide a priority class name to the webhook patching job.
     * 
     */
    public Optional<Output<String>> priorityClassName() {
        return Optional.ofNullable(this.priorityClassName);
    }

    @Import(name="runAsUser")
    private @Nullable Output<Integer> runAsUser;

    public Optional<Output<Integer>> runAsUser() {
        return Optional.ofNullable(this.runAsUser);
    }

    @Import(name="tolerations")
    private @Nullable Output<List<TolerationArgs>> tolerations;

    public Optional<Output<List<TolerationArgs>>> tolerations() {
        return Optional.ofNullable(this.tolerations);
    }

    private ControllerAdmissionWebhooksPatchArgs() {}

    private ControllerAdmissionWebhooksPatchArgs(ControllerAdmissionWebhooksPatchArgs $) {
        this.enabled = $.enabled;
        this.image = $.image;
        this.nodeSelector = $.nodeSelector;
        this.podAnnotations = $.podAnnotations;
        this.priorityClassName = $.priorityClassName;
        this.runAsUser = $.runAsUser;
        this.tolerations = $.tolerations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ControllerAdmissionWebhooksPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ControllerAdmissionWebhooksPatchArgs $;

        public Builder() {
            $ = new ControllerAdmissionWebhooksPatchArgs();
        }

        public Builder(ControllerAdmissionWebhooksPatchArgs defaults) {
            $ = new ControllerAdmissionWebhooksPatchArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder image(@Nullable Output<ControllerImageArgs> image) {
            $.image = image;
            return this;
        }

        public Builder image(ControllerImageArgs image) {
            return image(Output.of(image));
        }

        public Builder nodeSelector(@Nullable Output<Map<String,String>> nodeSelector) {
            $.nodeSelector = nodeSelector;
            return this;
        }

        public Builder nodeSelector(Map<String,String> nodeSelector) {
            return nodeSelector(Output.of(nodeSelector));
        }

        public Builder podAnnotations(@Nullable Output<Map<String,String>> podAnnotations) {
            $.podAnnotations = podAnnotations;
            return this;
        }

        public Builder podAnnotations(Map<String,String> podAnnotations) {
            return podAnnotations(Output.of(podAnnotations));
        }

        /**
         * @param priorityClassName Provide a priority class name to the webhook patching job.
         * 
         * @return builder
         * 
         */
        public Builder priorityClassName(@Nullable Output<String> priorityClassName) {
            $.priorityClassName = priorityClassName;
            return this;
        }

        /**
         * @param priorityClassName Provide a priority class name to the webhook patching job.
         * 
         * @return builder
         * 
         */
        public Builder priorityClassName(String priorityClassName) {
            return priorityClassName(Output.of(priorityClassName));
        }

        public Builder runAsUser(@Nullable Output<Integer> runAsUser) {
            $.runAsUser = runAsUser;
            return this;
        }

        public Builder runAsUser(Integer runAsUser) {
            return runAsUser(Output.of(runAsUser));
        }

        public Builder tolerations(@Nullable Output<List<TolerationArgs>> tolerations) {
            $.tolerations = tolerations;
            return this;
        }

        public Builder tolerations(List<TolerationArgs> tolerations) {
            return tolerations(Output.of(tolerations));
        }

        public Builder tolerations(TolerationArgs... tolerations) {
            return tolerations(List.of(tolerations));
        }

        public ControllerAdmissionWebhooksPatchArgs build() {
            return $;
        }
    }

}

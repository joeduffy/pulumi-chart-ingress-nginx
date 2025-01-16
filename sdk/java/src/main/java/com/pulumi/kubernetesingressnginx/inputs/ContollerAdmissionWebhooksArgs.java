// *** WARNING: this file was generated by pulumi-language-java. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetesingressnginx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetesingressnginx.inputs.ControllerAdmissionWebhooksCreateSecretJobArgs;
import com.pulumi.kubernetesingressnginx.inputs.ControllerAdmissionWebhooksPatchArgs;
import com.pulumi.kubernetesingressnginx.inputs.ControllerAdmissionWebhooksPatchWebhbookJobArgs;
import com.pulumi.kubernetesingressnginx.inputs.ControllerAdmissionWebhooksServiceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContollerAdmissionWebhooksArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContollerAdmissionWebhooksArgs Empty = new ContollerAdmissionWebhooksArgs();

    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    @Import(name="createSecretJob")
    private @Nullable Output<ControllerAdmissionWebhooksCreateSecretJobArgs> createSecretJob;

    public Optional<Output<ControllerAdmissionWebhooksCreateSecretJobArgs>> createSecretJob() {
        return Optional.ofNullable(this.createSecretJob);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Use an existing PSP instead of creating one.
     * 
     */
    @Import(name="existingPsp")
    private @Nullable Output<String> existingPsp;

    /**
     * @return Use an existing PSP instead of creating one.
     * 
     */
    public Optional<Output<String>> existingPsp() {
        return Optional.ofNullable(this.existingPsp);
    }

    @Import(name="failurePolicy")
    private @Nullable Output<String> failurePolicy;

    public Optional<Output<String>> failurePolicy() {
        return Optional.ofNullable(this.failurePolicy);
    }

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="namespaceSelector")
    private @Nullable Output<Map<String,Map<String,String>>> namespaceSelector;

    public Optional<Output<Map<String,Map<String,String>>>> namespaceSelector() {
        return Optional.ofNullable(this.namespaceSelector);
    }

    @Import(name="objectSelector")
    private @Nullable Output<Map<String,Map<String,String>>> objectSelector;

    public Optional<Output<Map<String,Map<String,String>>>> objectSelector() {
        return Optional.ofNullable(this.objectSelector);
    }

    @Import(name="patch")
    private @Nullable Output<ControllerAdmissionWebhooksPatchArgs> patch;

    public Optional<Output<ControllerAdmissionWebhooksPatchArgs>> patch() {
        return Optional.ofNullable(this.patch);
    }

    @Import(name="patchWebhookJob")
    private @Nullable Output<ControllerAdmissionWebhooksPatchWebhbookJobArgs> patchWebhookJob;

    public Optional<Output<ControllerAdmissionWebhooksPatchWebhbookJobArgs>> patchWebhookJob() {
        return Optional.ofNullable(this.patchWebhookJob);
    }

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="service")
    private @Nullable Output<ControllerAdmissionWebhooksServiceArgs> service;

    public Optional<Output<ControllerAdmissionWebhooksServiceArgs>> service() {
        return Optional.ofNullable(this.service);
    }

    @Import(name="timeoutSeconds")
    private @Nullable Output<Integer> timeoutSeconds;

    public Optional<Output<Integer>> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    private ContollerAdmissionWebhooksArgs() {}

    private ContollerAdmissionWebhooksArgs(ContollerAdmissionWebhooksArgs $) {
        this.annotations = $.annotations;
        this.certificate = $.certificate;
        this.createSecretJob = $.createSecretJob;
        this.enabled = $.enabled;
        this.existingPsp = $.existingPsp;
        this.failurePolicy = $.failurePolicy;
        this.key = $.key;
        this.namespaceSelector = $.namespaceSelector;
        this.objectSelector = $.objectSelector;
        this.patch = $.patch;
        this.patchWebhookJob = $.patchWebhookJob;
        this.port = $.port;
        this.service = $.service;
        this.timeoutSeconds = $.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContollerAdmissionWebhooksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContollerAdmissionWebhooksArgs $;

        public Builder() {
            $ = new ContollerAdmissionWebhooksArgs();
        }

        public Builder(ContollerAdmissionWebhooksArgs defaults) {
            $ = new ContollerAdmissionWebhooksArgs(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder createSecretJob(@Nullable Output<ControllerAdmissionWebhooksCreateSecretJobArgs> createSecretJob) {
            $.createSecretJob = createSecretJob;
            return this;
        }

        public Builder createSecretJob(ControllerAdmissionWebhooksCreateSecretJobArgs createSecretJob) {
            return createSecretJob(Output.of(createSecretJob));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param existingPsp Use an existing PSP instead of creating one.
         * 
         * @return builder
         * 
         */
        public Builder existingPsp(@Nullable Output<String> existingPsp) {
            $.existingPsp = existingPsp;
            return this;
        }

        /**
         * @param existingPsp Use an existing PSP instead of creating one.
         * 
         * @return builder
         * 
         */
        public Builder existingPsp(String existingPsp) {
            return existingPsp(Output.of(existingPsp));
        }

        public Builder failurePolicy(@Nullable Output<String> failurePolicy) {
            $.failurePolicy = failurePolicy;
            return this;
        }

        public Builder failurePolicy(String failurePolicy) {
            return failurePolicy(Output.of(failurePolicy));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder namespaceSelector(@Nullable Output<Map<String,Map<String,String>>> namespaceSelector) {
            $.namespaceSelector = namespaceSelector;
            return this;
        }

        public Builder namespaceSelector(Map<String,Map<String,String>> namespaceSelector) {
            return namespaceSelector(Output.of(namespaceSelector));
        }

        public Builder objectSelector(@Nullable Output<Map<String,Map<String,String>>> objectSelector) {
            $.objectSelector = objectSelector;
            return this;
        }

        public Builder objectSelector(Map<String,Map<String,String>> objectSelector) {
            return objectSelector(Output.of(objectSelector));
        }

        public Builder patch(@Nullable Output<ControllerAdmissionWebhooksPatchArgs> patch) {
            $.patch = patch;
            return this;
        }

        public Builder patch(ControllerAdmissionWebhooksPatchArgs patch) {
            return patch(Output.of(patch));
        }

        public Builder patchWebhookJob(@Nullable Output<ControllerAdmissionWebhooksPatchWebhbookJobArgs> patchWebhookJob) {
            $.patchWebhookJob = patchWebhookJob;
            return this;
        }

        public Builder patchWebhookJob(ControllerAdmissionWebhooksPatchWebhbookJobArgs patchWebhookJob) {
            return patchWebhookJob(Output.of(patchWebhookJob));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder service(@Nullable Output<ControllerAdmissionWebhooksServiceArgs> service) {
            $.service = service;
            return this;
        }

        public Builder service(ControllerAdmissionWebhooksServiceArgs service) {
            return service(Output.of(service));
        }

        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Builder timeoutSeconds(Integer timeoutSeconds) {
            return timeoutSeconds(Output.of(timeoutSeconds));
        }

        public ContollerAdmissionWebhooksArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetesingressnginx;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core.v1.inputs.LocalObjectReferenceArgs;
import com.pulumi.kubernetesingressnginx.inputs.ControllerArgs;
import com.pulumi.kubernetesingressnginx.inputs.ControllerDefaultBackendArgs;
import com.pulumi.kubernetesingressnginx.inputs.ControllerPodSecurityPolicyArgs;
import com.pulumi.kubernetesingressnginx.inputs.ControllerRBACArgs;
import com.pulumi.kubernetesingressnginx.inputs.ControllerServiceAccountArgs;
import com.pulumi.kubernetesingressnginx.inputs.ReleaseArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IngressControllerArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressControllerArgs Empty = new IngressControllerArgs();

    @Import(name="controller")
    private @Nullable Output<ControllerArgs> controller;

    public Optional<Output<ControllerArgs>> controller() {
        return Optional.ofNullable(this.controller);
    }

    /**
     * Default 404 backend.
     * 
     */
    @Import(name="defaultBackend")
    private @Nullable Output<ControllerDefaultBackendArgs> defaultBackend;

    /**
     * @return Default 404 backend.
     * 
     */
    public Optional<Output<ControllerDefaultBackendArgs>> defaultBackend() {
        return Optional.ofNullable(this.defaultBackend);
    }

    /**
     * A base64ed Diffie-Hellman parameter. This can be generated with: openssl dhparam 4096 2&gt; /dev/null | base64 Ref: https://github.com/kubernetes/ingress-nginx/tree/main/docs/examples/customization/ssl-dh-param.
     * 
     */
    @Import(name="dhParam")
    private @Nullable Output<String> dhParam;

    /**
     * @return A base64ed Diffie-Hellman parameter. This can be generated with: openssl dhparam 4096 2&gt; /dev/null | base64 Ref: https://github.com/kubernetes/ingress-nginx/tree/main/docs/examples/customization/ssl-dh-param.
     * 
     */
    public Optional<Output<String>> dhParam() {
        return Optional.ofNullable(this.dhParam);
    }

    /**
     * Overrides for generated resource names.
     * 
     */
    @Import(name="fullnameOverride")
    private @Nullable Output<String> fullnameOverride;

    /**
     * @return Overrides for generated resource names.
     * 
     */
    public Optional<Output<String>> fullnameOverride() {
        return Optional.ofNullable(this.fullnameOverride);
    }

    /**
     * HelmOptions is an escape hatch that lets the end user control any aspect of the Helm deployment. This exposes the entirety of the underlying Helm Release component args.
     * 
     */
    @Import(name="helmOptions")
    private @Nullable Output<ReleaseArgs> helmOptions;

    /**
     * @return HelmOptions is an escape hatch that lets the end user control any aspect of the Helm deployment. This exposes the entirety of the underlying Helm Release component args.
     * 
     */
    public Optional<Output<ReleaseArgs>> helmOptions() {
        return Optional.ofNullable(this.helmOptions);
    }

    /**
     * Optional array of imagePullSecrets containing private registry credentials Ref: https://kubernetes.io/docs/tasks/configure-pod-container/pull-image-private-registry/.
     * 
     */
    @Import(name="imagePullSecrets")
    private @Nullable Output<List<LocalObjectReferenceArgs>> imagePullSecrets;

    /**
     * @return Optional array of imagePullSecrets containing private registry credentials Ref: https://kubernetes.io/docs/tasks/configure-pod-container/pull-image-private-registry/.
     * 
     */
    public Optional<Output<List<LocalObjectReferenceArgs>>> imagePullSecrets() {
        return Optional.ofNullable(this.imagePullSecrets);
    }

    /**
     * Overrides for generated resource names.
     * 
     */
    @Import(name="nameOverride")
    private @Nullable Output<String> nameOverride;

    /**
     * @return Overrides for generated resource names.
     * 
     */
    public Optional<Output<String>> nameOverride() {
        return Optional.ofNullable(this.nameOverride);
    }

    /**
     * If true, create &amp; use Pod Security Policy resources https://kubernetes.io/docs/concepts/policy/pod-security-policy/
     * 
     */
    @Import(name="podSecurityPolicy")
    private @Nullable Output<ControllerPodSecurityPolicyArgs> podSecurityPolicy;

    /**
     * @return If true, create &amp; use Pod Security Policy resources https://kubernetes.io/docs/concepts/policy/pod-security-policy/
     * 
     */
    public Optional<Output<ControllerPodSecurityPolicyArgs>> podSecurityPolicy() {
        return Optional.ofNullable(this.podSecurityPolicy);
    }

    /**
     * Enable RBAC as per https://github.com/kubernetes/ingress-nginx/blob/main/docs/deploy/rbac.md and https://github.com/kubernetes/ingress-nginx/issues/266
     * 
     */
    @Import(name="rbac")
    private @Nullable Output<ControllerRBACArgs> rbac;

    /**
     * @return Enable RBAC as per https://github.com/kubernetes/ingress-nginx/blob/main/docs/deploy/rbac.md and https://github.com/kubernetes/ingress-nginx/issues/266
     * 
     */
    public Optional<Output<ControllerRBACArgs>> rbac() {
        return Optional.ofNullable(this.rbac);
    }

    /**
     * Rollback limit.
     * 
     */
    @Import(name="revisionHistoryLimit")
    private @Nullable Output<Integer> revisionHistoryLimit;

    /**
     * @return Rollback limit.
     * 
     */
    public Optional<Output<Integer>> revisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }

    @Import(name="serviceAccount")
    private @Nullable Output<ControllerServiceAccountArgs> serviceAccount;

    public Optional<Output<ControllerServiceAccountArgs>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * TCP service key:value pairs Ref: https://github.com/kubernetes/ingress-nginx/blob/main/docs/user-guide/exposing-tcp-udp-services.md.
     * 
     */
    @Import(name="tcp")
    private @Nullable Output<Map<String,Map<String,String>>> tcp;

    /**
     * @return TCP service key:value pairs Ref: https://github.com/kubernetes/ingress-nginx/blob/main/docs/user-guide/exposing-tcp-udp-services.md.
     * 
     */
    public Optional<Output<Map<String,Map<String,String>>>> tcp() {
        return Optional.ofNullable(this.tcp);
    }

    /**
     * UDP service key:value pairs Ref: https://github.com/kubernetes/ingress-nginx/blob/main/docs/user-guide/exposing-tcp-udp-services.md.
     * 
     */
    @Import(name="udp")
    private @Nullable Output<Map<String,Map<String,String>>> udp;

    /**
     * @return UDP service key:value pairs Ref: https://github.com/kubernetes/ingress-nginx/blob/main/docs/user-guide/exposing-tcp-udp-services.md.
     * 
     */
    public Optional<Output<Map<String,Map<String,String>>>> udp() {
        return Optional.ofNullable(this.udp);
    }

    private IngressControllerArgs() {}

    private IngressControllerArgs(IngressControllerArgs $) {
        this.controller = $.controller;
        this.defaultBackend = $.defaultBackend;
        this.dhParam = $.dhParam;
        this.fullnameOverride = $.fullnameOverride;
        this.helmOptions = $.helmOptions;
        this.imagePullSecrets = $.imagePullSecrets;
        this.nameOverride = $.nameOverride;
        this.podSecurityPolicy = $.podSecurityPolicy;
        this.rbac = $.rbac;
        this.revisionHistoryLimit = $.revisionHistoryLimit;
        this.serviceAccount = $.serviceAccount;
        this.tcp = $.tcp;
        this.udp = $.udp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngressControllerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressControllerArgs $;

        public Builder() {
            $ = new IngressControllerArgs();
        }

        public Builder(IngressControllerArgs defaults) {
            $ = new IngressControllerArgs(Objects.requireNonNull(defaults));
        }

        public Builder controller(@Nullable Output<ControllerArgs> controller) {
            $.controller = controller;
            return this;
        }

        public Builder controller(ControllerArgs controller) {
            return controller(Output.of(controller));
        }

        /**
         * @param defaultBackend Default 404 backend.
         * 
         * @return builder
         * 
         */
        public Builder defaultBackend(@Nullable Output<ControllerDefaultBackendArgs> defaultBackend) {
            $.defaultBackend = defaultBackend;
            return this;
        }

        /**
         * @param defaultBackend Default 404 backend.
         * 
         * @return builder
         * 
         */
        public Builder defaultBackend(ControllerDefaultBackendArgs defaultBackend) {
            return defaultBackend(Output.of(defaultBackend));
        }

        /**
         * @param dhParam A base64ed Diffie-Hellman parameter. This can be generated with: openssl dhparam 4096 2&gt; /dev/null | base64 Ref: https://github.com/kubernetes/ingress-nginx/tree/main/docs/examples/customization/ssl-dh-param.
         * 
         * @return builder
         * 
         */
        public Builder dhParam(@Nullable Output<String> dhParam) {
            $.dhParam = dhParam;
            return this;
        }

        /**
         * @param dhParam A base64ed Diffie-Hellman parameter. This can be generated with: openssl dhparam 4096 2&gt; /dev/null | base64 Ref: https://github.com/kubernetes/ingress-nginx/tree/main/docs/examples/customization/ssl-dh-param.
         * 
         * @return builder
         * 
         */
        public Builder dhParam(String dhParam) {
            return dhParam(Output.of(dhParam));
        }

        /**
         * @param fullnameOverride Overrides for generated resource names.
         * 
         * @return builder
         * 
         */
        public Builder fullnameOverride(@Nullable Output<String> fullnameOverride) {
            $.fullnameOverride = fullnameOverride;
            return this;
        }

        /**
         * @param fullnameOverride Overrides for generated resource names.
         * 
         * @return builder
         * 
         */
        public Builder fullnameOverride(String fullnameOverride) {
            return fullnameOverride(Output.of(fullnameOverride));
        }

        /**
         * @param helmOptions HelmOptions is an escape hatch that lets the end user control any aspect of the Helm deployment. This exposes the entirety of the underlying Helm Release component args.
         * 
         * @return builder
         * 
         */
        public Builder helmOptions(@Nullable Output<ReleaseArgs> helmOptions) {
            $.helmOptions = helmOptions;
            return this;
        }

        /**
         * @param helmOptions HelmOptions is an escape hatch that lets the end user control any aspect of the Helm deployment. This exposes the entirety of the underlying Helm Release component args.
         * 
         * @return builder
         * 
         */
        public Builder helmOptions(ReleaseArgs helmOptions) {
            return helmOptions(Output.of(helmOptions));
        }

        /**
         * @param imagePullSecrets Optional array of imagePullSecrets containing private registry credentials Ref: https://kubernetes.io/docs/tasks/configure-pod-container/pull-image-private-registry/.
         * 
         * @return builder
         * 
         */
        public Builder imagePullSecrets(@Nullable Output<List<LocalObjectReferenceArgs>> imagePullSecrets) {
            $.imagePullSecrets = imagePullSecrets;
            return this;
        }

        /**
         * @param imagePullSecrets Optional array of imagePullSecrets containing private registry credentials Ref: https://kubernetes.io/docs/tasks/configure-pod-container/pull-image-private-registry/.
         * 
         * @return builder
         * 
         */
        public Builder imagePullSecrets(List<LocalObjectReferenceArgs> imagePullSecrets) {
            return imagePullSecrets(Output.of(imagePullSecrets));
        }

        /**
         * @param imagePullSecrets Optional array of imagePullSecrets containing private registry credentials Ref: https://kubernetes.io/docs/tasks/configure-pod-container/pull-image-private-registry/.
         * 
         * @return builder
         * 
         */
        public Builder imagePullSecrets(LocalObjectReferenceArgs... imagePullSecrets) {
            return imagePullSecrets(List.of(imagePullSecrets));
        }

        /**
         * @param nameOverride Overrides for generated resource names.
         * 
         * @return builder
         * 
         */
        public Builder nameOverride(@Nullable Output<String> nameOverride) {
            $.nameOverride = nameOverride;
            return this;
        }

        /**
         * @param nameOverride Overrides for generated resource names.
         * 
         * @return builder
         * 
         */
        public Builder nameOverride(String nameOverride) {
            return nameOverride(Output.of(nameOverride));
        }

        /**
         * @param podSecurityPolicy If true, create &amp; use Pod Security Policy resources https://kubernetes.io/docs/concepts/policy/pod-security-policy/
         * 
         * @return builder
         * 
         */
        public Builder podSecurityPolicy(@Nullable Output<ControllerPodSecurityPolicyArgs> podSecurityPolicy) {
            $.podSecurityPolicy = podSecurityPolicy;
            return this;
        }

        /**
         * @param podSecurityPolicy If true, create &amp; use Pod Security Policy resources https://kubernetes.io/docs/concepts/policy/pod-security-policy/
         * 
         * @return builder
         * 
         */
        public Builder podSecurityPolicy(ControllerPodSecurityPolicyArgs podSecurityPolicy) {
            return podSecurityPolicy(Output.of(podSecurityPolicy));
        }

        /**
         * @param rbac Enable RBAC as per https://github.com/kubernetes/ingress-nginx/blob/main/docs/deploy/rbac.md and https://github.com/kubernetes/ingress-nginx/issues/266
         * 
         * @return builder
         * 
         */
        public Builder rbac(@Nullable Output<ControllerRBACArgs> rbac) {
            $.rbac = rbac;
            return this;
        }

        /**
         * @param rbac Enable RBAC as per https://github.com/kubernetes/ingress-nginx/blob/main/docs/deploy/rbac.md and https://github.com/kubernetes/ingress-nginx/issues/266
         * 
         * @return builder
         * 
         */
        public Builder rbac(ControllerRBACArgs rbac) {
            return rbac(Output.of(rbac));
        }

        /**
         * @param revisionHistoryLimit Rollback limit.
         * 
         * @return builder
         * 
         */
        public Builder revisionHistoryLimit(@Nullable Output<Integer> revisionHistoryLimit) {
            $.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        /**
         * @param revisionHistoryLimit Rollback limit.
         * 
         * @return builder
         * 
         */
        public Builder revisionHistoryLimit(Integer revisionHistoryLimit) {
            return revisionHistoryLimit(Output.of(revisionHistoryLimit));
        }

        public Builder serviceAccount(@Nullable Output<ControllerServiceAccountArgs> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(ControllerServiceAccountArgs serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param tcp TCP service key:value pairs Ref: https://github.com/kubernetes/ingress-nginx/blob/main/docs/user-guide/exposing-tcp-udp-services.md.
         * 
         * @return builder
         * 
         */
        public Builder tcp(@Nullable Output<Map<String,Map<String,String>>> tcp) {
            $.tcp = tcp;
            return this;
        }

        /**
         * @param tcp TCP service key:value pairs Ref: https://github.com/kubernetes/ingress-nginx/blob/main/docs/user-guide/exposing-tcp-udp-services.md.
         * 
         * @return builder
         * 
         */
        public Builder tcp(Map<String,Map<String,String>> tcp) {
            return tcp(Output.of(tcp));
        }

        /**
         * @param udp UDP service key:value pairs Ref: https://github.com/kubernetes/ingress-nginx/blob/main/docs/user-guide/exposing-tcp-udp-services.md.
         * 
         * @return builder
         * 
         */
        public Builder udp(@Nullable Output<Map<String,Map<String,String>>> udp) {
            $.udp = udp;
            return this;
        }

        /**
         * @param udp UDP service key:value pairs Ref: https://github.com/kubernetes/ingress-nginx/blob/main/docs/user-guide/exposing-tcp-udp-services.md.
         * 
         * @return builder
         * 
         */
        public Builder udp(Map<String,Map<String,String>> udp) {
            return udp(Output.of(udp));
        }

        public IngressControllerArgs build() {
            return $;
        }
    }

}
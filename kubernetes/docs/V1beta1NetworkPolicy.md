
# V1beta1NetworkPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) | Standard object&#39;s metadata. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata |  [optional]
**spec** | [**V1beta1NetworkPolicySpec**](V1beta1NetworkPolicySpec.md) | Specification of the desired behavior for this NetworkPolicy. |  [optional]




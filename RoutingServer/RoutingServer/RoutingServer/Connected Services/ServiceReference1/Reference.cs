﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace RoutingServer.ServiceReference1 {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="ServiceReference1.IProxy")]
    public interface IProxy {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IProxy/GetData", ReplyAction="http://tempuri.org/IProxy/GetDataResponse")]
        void GetData(int value);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IProxy/GetData", ReplyAction="http://tempuri.org/IProxy/GetDataResponse")]
        System.Threading.Tasks.Task GetDataAsync(int value);
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface IProxyChannel : RoutingServer.ServiceReference1.IProxy, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class ProxyClient : System.ServiceModel.ClientBase<RoutingServer.ServiceReference1.IProxy>, RoutingServer.ServiceReference1.IProxy {
        
        public ProxyClient() {
        }
        
        public ProxyClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public ProxyClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public ProxyClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public ProxyClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        public void GetData(int value) {
            base.Channel.GetData(value);
        }
        
        public System.Threading.Tasks.Task GetDataAsync(int value) {
            return base.Channel.GetDataAsync(value);
        }
    }
}

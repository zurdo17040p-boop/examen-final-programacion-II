import type {Articulo,ArticuloCategoria,ClienteFactura,FacturaDetalle} from '../types/reportes';
const API='http://localhost:8080';
async function get<T>(url:string):Promise<T>{const r=await fetch(API+url);if(!r.ok)throw new Error(`Error HTTP ${r.status}`);return r.json();}
export const buscarArticulos=(nombre:string)=>get<Articulo[]>(`/articulos/mostrarActivosFiltro?nombre=${encodeURIComponent(nombre)}`);
export const reporteArticuloCategoria=()=>get<ArticuloCategoria[]>('/articulos/reporteArticuloCategoria');
export const reporteClienteFactura=()=>get<ClienteFactura[]>('/clientes/reporteClienteFactura');
export const reporteDetalle=()=>get<FacturaDetalle[]>('/clientes/reporteClienteFacturaDetalle');
